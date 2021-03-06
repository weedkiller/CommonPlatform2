﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Security.Cryptography;
using System.Text;
using System.Threading.Tasks;

namespace Project.Infrastructure.FrameworkCore.ToolKit
{
    public  class SignHelper
    {

        /// <summary>
        /// 获取公钥和私钥
        /// </summary>
        /// <returns></returns>
        public static Tuple<string, string> GetPublicKeyAndPrivateKey()
        {
            var key = "myRSA";
            byte[] keyArray = UTF8Encoding.UTF8.GetBytes(key);

            RSACryptoServiceProvider rsAalg = new RSACryptoServiceProvider();

            string strPrivateKey = Convert.ToBase64String(keyArray);
            string strPublicKey = Convert.ToBase64String(keyArray);

            return new Tuple<string, string>(strPublicKey, strPrivateKey);
        }

        /// <summary>
        /// 对数据进行签名
        /// </summary>
        /// <param name="strDataToSign"></param>
        /// <param name="strPrivateKey"></param>
        /// <returns></returns>
        public static string HashAndSign(string strDataToSign, string strPrivateKey)
        {
            ASCIIEncoding byteConverter = new ASCIIEncoding();
            byte[] dataToSign = byteConverter.GetBytes(strDataToSign);
            try
            {
                RSACryptoServiceProvider rsAalg = new RSACryptoServiceProvider();
                rsAalg.ImportCspBlob(Convert.FromBase64String(strPrivateKey));
                byte[] signedData = rsAalg.SignData(dataToSign, new SHA1CryptoServiceProvider());
                string strSignedData = Convert.ToBase64String(signedData);
                return strSignedData;
            }
            catch (CryptographicException e)
            {
                Console.WriteLine(e.Message);
                return null;
            }
        }

        /// <summary>
        /// 验证签名
        /// </summary>
        /// <param name="strDataToVerify"></param>
        /// <param name="strSignedData"></param>
        /// <param name="strPublicKey"></param>
        /// <returns></returns>
        public static bool VerifySignedHash(string strDataToVerify, string strSignedData, string strPublicKey)
        {
            byte[] signedData = Convert.FromBase64String(strSignedData);
            ASCIIEncoding byteConverter = new ASCIIEncoding();
            byte[] dataToVerify = byteConverter.GetBytes(strDataToVerify);
            try
            {
                RSACryptoServiceProvider rsAalg = new RSACryptoServiceProvider();
                rsAalg.ImportCspBlob(Convert.FromBase64String(strPublicKey));
                return rsAalg.VerifyData(dataToVerify, new SHA1CryptoServiceProvider(), signedData);
            }
            catch (CryptographicException e)
            {
                Console.WriteLine(e.Message);

                return false;
            }
        }



    }
}
