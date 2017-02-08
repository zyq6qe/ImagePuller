package imagePuller;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;

import javax.imageio.ImageIO;

public class ImagePuller {

	public static void main(String[] args) {
		ArrayList<String> urls = new ArrayList<String>();
        urls.add("http://2.bp.blogspot.com/2WdUc4idVGYlrKLjNgtbxqGZ_DjJTf8GBRalGaUOCtCEiPhe2k9sqZlbLALQI3cQoqhPomB-BIKk=s0");
        
        urls.add("http://2.bp.blogspot.com/0uUzy8jRXz-WBbeZfJOOZTBNmFm_WT5MbC6amgrAvoYZhgCS_-cGNRpF6SgJmqfNu-lJW8HB29NP=s0");
        
        urls.add("http://2.bp.blogspot.com/T87wZQ8iskEGVGErKLOx2Bx1Psd1mbqqnRXzl4wcv5PFDnDlcT7tCokl4gXSKNCuYroLHrDZ9S1l=s0");
        
        urls.add("http://2.bp.blogspot.com/KZ4H3lVaeLTPO9daoru-To6ezgMiKiXT_sX_YSuYwjg5HCUpAPyVnORoySc7JbeZT69zASL81idA=s0");
        
        urls.add("http://2.bp.blogspot.com/CPMaiiwv32JGiyoX_Y2x59LDSC51R_faRyc3OcrFEXOkB8hZn0QpShTGzpX80bgOypfjUijqMMo0=s0");
        
        urls.add("http://2.bp.blogspot.com/gFIfdxOOwsQguLGOv6mxnNvGXt0aBFEBdnXax_P7MS5uUEWz7ez8rB3rKMoZ_c40Ppkq4eSq2y_w=s0");
        
        urls.add("http://2.bp.blogspot.com/IjEc_O2wzk3RElcGKa7vSzMufVsWKqNiOYmaBDYNTobRUM5jLQsQV3uUDp6kwb0ohEp6Xf3QcOcC=s0");
        
        urls.add("http://2.bp.blogspot.com/oDpYKCEWZuBRJ1I0AiiI8diiGQfOqFq_ns9CpwugYwKgEJWxV4W6jG2x7SYwJHucKx66wfdEZHCV=s0");
        
        urls.add("http://2.bp.blogspot.com/ic1Q_CKAo2ZohnjT4396tLpJzxR1v32cU2kFtzBJCRsKMgs923SXtPAkzUAFs63peQtHHPZVlaMy=s0");
        
        urls.add("http://2.bp.blogspot.com/n_YUvRMM2lFFRhXvO5At46CPsfVBLVoiPiX8i-nIql4tqVH-RYM6dXYJQ48c2p9cs5EsGKg360pc=s0");
        
        urls.add("http://2.bp.blogspot.com/4m3E0Bqu4LFa2b57h9oGbDfPUCMNSM3ZGK5_VXkknVYQX1ezAFkgo2XA3Pa_H-CLVeOykvCj4vO0=s0");
        
        urls.add("http://2.bp.blogspot.com/hhTu_ZrPSUJG9UnNbLHBtRtBedfxT6RWcRyzFbe63QXNzMjygBLIYFrAd4HiOSEJWhjSd0xTqsOy=s0");
        
        urls.add("http://2.bp.blogspot.com/-wXxtCO8OEbdz-0xJPcDCLLGjkyiXxIj-M_0T1MA0biIP7YrUjYKH674ukvFAa5o09bt7mLPp3SD=s0");
        
        urls.add("http://2.bp.blogspot.com/dqnp5szOi0DjWk_TjpQJ3sDqNNZzlJgot4mfpvqJbDZpRs3oG_sk-Yw6g_fB9ZnAzByxSI3nTebB=s0");
        
        urls.add("http://2.bp.blogspot.com/sOTvPAhbE8WtT8-aMjqgKzktpJzPGxzdVB4IIPQIJo-ODo2oWWuHZPvkcrvG6pPoWyD6pNaJ0HFU=s0");
        
        urls.add("http://2.bp.blogspot.com/1i6GWb4l7XTCls4wkouyEiUp3xdURPJRALKt9wCzwkmI8Im42vqJL78NyJN2-HLEnWIBCuztQAYm=s0");
        
        urls.add("http://2.bp.blogspot.com/t_yo77yW0vGPE-S7WN4m9uIuDt1wVNahKRWoZkgRtLq0TzQOij4GRG__ALM5zPjZdmoJvOy9dBSo=s0");
        
        urls.add("http://2.bp.blogspot.com/wE80EsGBOjmGawkbsS2nCPLVYRdw7RGm8ge3sarHD9q9z8w5QkUBr9iM35u4viOI-DznlMkh6vzC=s0");
        
        urls.add("http://2.bp.blogspot.com/eoy2Lt4yxibFKZrq3Lbh8wsfRMWFlVp-UaLaFav0aA31M9T0i_VraWC21YYIlwQqFfl-BJ10Z_U1=s0");
        
        urls.add("http://2.bp.blogspot.com/A5kingsbVCtXTRmBcbrlB8RYMyy1LLORQpd76x32ZkLYPa14BqLHPPtWfRVRnf-xrLW8KYN5Aus9=s0");
        
        urls.add("http://2.bp.blogspot.com/WpMLx4RoBjQ6RY_-RB3npT2e5MXY1b248xphR3SJKJnhs8DdQYQeLfV4J0T53iGVxkpFIebtaXZ-=s0");
        
        urls.add("http://2.bp.blogspot.com/JZpLJm8M8a25sSxDS4hHW8kATjer3g8w40Wfj678OB54KZoAge6imAl9HouvN5kHwXAPbR-g5vHW=s0");
        
        urls.add("http://2.bp.blogspot.com/2Ul7z7Wb46j4CO1UugSG4IDMoas9WrVx3kUwr8AI57ROZsxUyhW9-S6ADsfPSqcHsBaOb5LDsPBi=s0");
        
        urls.add("http://2.bp.blogspot.com/XS26DlmyKbwX9z4ebR3lsbER_SoIVeW8MulmN2-b7otPS08bn9VGXHj8obtiNdyUoBXioKGaAbqA=s0");
        
        urls.add("http://2.bp.blogspot.com/KM_t9Qye70fMX07lBHrEUENqDTr4Buc5Z5hhcjPjvxKKf2h7IWKIcg0nkGgtX1vrhv2YGcG8KUsy=s0");
        
        urls.add("http://2.bp.blogspot.com/Gw0pmrJKj7w--WdSyFgbySq-9s6RDOURoegAGTZ7SP09qwJT9NxzI9I-eiuLLOUzVee0b1s9yBLA=s0");
        
        urls.add("http://2.bp.blogspot.com/9vNQpY3_lRLHw4WTeHHLJagEOw3ivDZL1Tl6M5BThrup7IcEWSw7EBVjfbqq6jP9n94qwQDppW7h=s0");
        
        urls.add("http://2.bp.blogspot.com/z1M6pdZF6dO4cfCfJJQpK39Mt9U6zyPgdt9xKtCyZGK2THHVmokcQIOGU36I1C3Ug7AF4zBh66Ew=s0");
        
        urls.add("http://2.bp.blogspot.com/x5nMxNRSq0ewPMNvQftb0jwu6Hez5_NOlq7c2TB4JXUptjZVxss1Ydu5x04MfNw08HM9BFbroFV8=s0");
        
        urls.add("http://2.bp.blogspot.com/eC4xnudtZV-mkcTP0sLPSO3G83-ub120l9fH6egkXqgWlxHU_6Enr7QzivTnwqZPqh_g5Rtn9orp=s0");
        
        urls.add("http://2.bp.blogspot.com/GnRVsB062s_-ge711mTkNENaG2bWPe6S6XoJCyoPgNtIywrqzDJ_Og_nlEQ-JomWfX2yiKbfWRFk=s0");
        
        urls.add("http://2.bp.blogspot.com/X8i6E5BtEPQWvqO7PmL_MaDeiHbkDH8EjZMSwgMxzVCe6PGz0I1A2zsIeG2XwGrYAgfqakmwaLTp=s0");
        
        urls.add("http://2.bp.blogspot.com/pYcMs6b7C4hadAmDguGWHa88JL0zP_CEZQDk1faRDtw5LlYtnqI5dI-RN0lgGxs-0iRC4nUilaeg=s0");
        
        urls.add("http://2.bp.blogspot.com/K--dPlb3kgOgn8gbSYiHUZb5dwe5ajBhNBbD3fd6nPYIpHzdaV782dvwwMgXNr2Dtpc9LpP42ozP=s0");
        
        urls.add("http://2.bp.blogspot.com/4rvjJJ3Qx6iLKoxXsXyFGNFVLblPixnTfZoROzoMb6h7Roc0pedqLYMHZZMXvgLaGByTHazsPIHG=s0");
        
        urls.add("http://2.bp.blogspot.com/uDpLT73jdaoFIvqsAcf8PHYtLWAiR5FIFEhgBm_IKDmSR5wPdoggZsgndJeapurACUdazYdfUZa9=s0");
        
        urls.add("http://2.bp.blogspot.com/VMiVKZgzTGllmFuguAfVK0ftXC8Ttw9TqclDoVmq9sM3gDxRN-fkQg2mcvMpepo8_yYEcC-Y5G9v=s0");
        
        urls.add("http://2.bp.blogspot.com/c5wsqAWySUtuNYHEdSWi5L9jY3i_6tDsJNuzh8e6t1Nmg5BNAicsBPisNddi_CwmSDuhjapK_W8h=s0");
        
        urls.add("http://2.bp.blogspot.com/BRWc43UfIrK_DrL9F903ULePV6dx6cyqdfQ-HpIWsvpPQPmT6OSa-YZZpfHXn0HskO8uV0rqxhOc=s0");
        
        urls.add("http://2.bp.blogspot.com/3QGfQyz6FLtoixqgaC0I_HjIa8pkXrTqi1vJpmD_in3zZrxFi00BE_wWvpyiEy9V_ab35WwwlhN6=s0");
        
        urls.add("http://2.bp.blogspot.com/SxiF-cddmds4PoXF9x8nQ6VkvqkteDNGAH7TLI6DOYgpK7xrlzNwBGCeER1XVFewz3SaqOMiHD3e=s0");
        
        urls.add("http://2.bp.blogspot.com/uTXWwVCGxiBr7OUs7brQDFqp6aPcy1X4S-G0WGPmuQtjyKio1rdocxpdYg6rsH6D_Omqf6NpOriB=s0");
        
        urls.add("http://2.bp.blogspot.com/WfqSYHqIV9H2VazEPMIxBaZNdxIPaEke8ktZZDb8dFRhvS9Zcgd4I4wRUgPKxGzgtDSB_T7P1MDY=s0");
        
        urls.add("http://2.bp.blogspot.com/PxOEd2iUPsv0f_R7PUUDGPjClN626jGIk1_i7zw1mSp5fH-luD9FHIw5h1ScJ8aQZACg6uoy2E59=s0");
        
        urls.add("http://2.bp.blogspot.com/tPqOVSauStINrp7M6hBff-LLR3cVVWUWp-B-Gg-4exJIoPwwid_aetUbSiljQq4RXrbNnuKyqSo8=s0");
        
        urls.add("http://2.bp.blogspot.com/GDnFBqD624YYD2WjTZXZ2S7YHCGO4hTqE9-1XyH7ZgKi1IK2vH0sbIHekunKfsGTEbOD4nvxGvym=s0");
        
        urls.add("http://2.bp.blogspot.com/f6VBWzJ4yOzWg16msR6KtuOtvkvk4r9vA9h1-QusYIAIOECyqrkpvNIxSawfelMNWy9C-xa0ROFt=s0");
        
        urls.add("http://2.bp.blogspot.com/Gst4xOjbQyHD2ZPEDnTto4x87Ptcjkyf8yuQnCyrcgaQ2pNVgmzrDUQn7_wG3_dF9PICn4UynuVd=s0");
        
        urls.add("http://2.bp.blogspot.com/VbIc_AWorPZ3aDzgcOUUlDASE2y3FQRHjSnbvOA7IXinvpLfCraTA5tj9iOXJxcRLdak9vsLydbT=s0");
        
        urls.add("http://2.bp.blogspot.com/g_v0zeI9dDXyKHDR4BjAz92rFDBEKfLwgvt4uWe1pfBN9ysu_Rs6hj5lbVck4z0na-0x5ImGcNHO=s0");
        
        urls.add("http://2.bp.blogspot.com/4wMCNU-aij33Wkc8yWWvcREWmW55nIUJrWysMYPBpgrQoqFceaAqOBoN2DzCJRa639tDdOv9WaBy=s0");
        
        urls.add("http://2.bp.blogspot.com/7naEaVIjcy6p3QUEy4bbJYJTlULnbXQ9K91LM6705UesyY1QWp67o1bL1nWuu3Lxg-wuWoFUwnZ0=s0");
        
        urls.add("http://2.bp.blogspot.com/BwuVqtuTChAPcYGJrhqa19nUm9b1hSnTqhh6RXlU64X03JGwhLAv2qfNQbozcQxrANmtji8P-b9B=s0");
        
        urls.add("http://2.bp.blogspot.com/B8itwKHDF8rNMzb2i4xdwsspJyVDWeToBN12nPBp6-PzHCrg7J8wiY-BOIbvtW-CgDdxOE_oQoIs=s0");
        
        urls.add("http://2.bp.blogspot.com/DZKXYDFnEJzvbBFzy_jeB7zcYVZoSZiYlwZTs6waTr99Itq69viw8i9Wl4P2QXdqOqfp7zA9TcB0=s0");
        
        urls.add("http://2.bp.blogspot.com/qqMgckVehkxpPr-kjnRQv3e5_Nj8nDhw9BPqNZhVO1HOfg2qS21JrvO5TdOBUPVnuJEvpbajl1g2=s0");
        
        urls.add("http://2.bp.blogspot.com/RkYzB9isaKD9p8HUZe46t100UR6DBKS1K93B5jWrXs_Joxc9F7o0jDRnP5XqFT2zmgMeakt4WdMb=s0");
        
        urls.add("http://2.bp.blogspot.com/OSD9guPhEo2F1FrDCcMgQAZozkBraBc-EMK79HrXPqBCQadYnR2GTa1sIxzFdyii9Ys13J10cf6n=s0");
        
        urls.add("http://2.bp.blogspot.com/jNa0UX2CL9TPGp5Bw60ccznXwXPvHXkjySpdPy_TAG6RJmownFAxKDSPj1tR9MF2Ev8orIXFi8C_=s0");
        
        urls.add("http://2.bp.blogspot.com/WefwkVa9pDMPoJJMgQ-Nj6zRn-kZE9Uvk30Yc24tLVHEJZ4D7UlJVEpc9W3U8Zl1I_787mmLY60g=s0");
        
        urls.add("http://2.bp.blogspot.com/_66n-zUb-atgBkWonJ9qIiqHSwPxGW3xCsTkN6ltYGptpPBEYoX5CIjm-yQHUw5r44wsMqFNVAtp=s0");
        
        urls.add("http://2.bp.blogspot.com/_5qPMMEM6T1ps3bb-z7FV_bgJhb9WcupxPiFx5eA2FstJnbzTS9_Xz4JGMU0q4kSeTOuAihgKNxq=s0");
        
        urls.add("http://2.bp.blogspot.com/c-YREOmmlAUUNvZcce7WEFaf_icLD42G8TzvjlOXv750rKp3A-xErgTsJDaOALIYJiOtQlAmShJq=s0");
        
        urls.add("http://2.bp.blogspot.com/drmGQdIxyYyH0zO4EpNFuccBz5CNh8ZL3--98mCdvltvy2HVe4s3OZ73Uk4bHW4Zc05GE3_-ovwO=s0");
        
        urls.add("http://2.bp.blogspot.com/8sdstlBFxtNQlbUu8rzrNwWyRX1iQkgeiybSBBlibe7677FnqySY9K7LkK0aIV80uMxt8CnicFgD=s0");
        
        urls.add("http://2.bp.blogspot.com/PgOkuYvY7QDkhZ0GKdLt7X3pbPVkL394pq15YQnBqeW5NeI5EKcvlDY2FW_EappdMzQSHYexA0g4=s0");
        
        urls.add("http://2.bp.blogspot.com/oezRVpLbERgNvQXzGuc5dfiQquwA1AsouD5dBpPVTS_si4R6eHRyJA_uO-kLY4UEdi71mR6Z7X5o=s0");
        
        urls.add("http://2.bp.blogspot.com/nYEBJOriLIEfK6ElNCTWdpHm6HE4c5bAWaKVS0lqBTZ-ino12XBPhr03yg1lccIPv1K1KUYsmtPk=s0");
        
        urls.add("http://2.bp.blogspot.com/Zs8AezFVPnOfB_ddph9CjS6QJN06zXKMkP0RR9X9-B6m_HMyuJiydu2NzSOEeb3s6A5GQVXVC4rK=s0");
        
        urls.add("http://2.bp.blogspot.com/drKc2NK2KGz5xet331dCU4qHGO8FoP7T5izyECtjYCy_nAXv3mfqE3DC6InacRTBaKQ3hBt1WIUh=s0");
        
        urls.add("http://2.bp.blogspot.com/EYiXN0uG_0lAZu2GJ1iIthkRz2yUzFB2rQvwWFKbfT_V_KpomOVHQh-O6UoFrfId4QKUm5DZxvdb=s0");
        
        urls.add("http://2.bp.blogspot.com/tkXzTQWx0N7C5YBlJYb9XpTMDfrYZrCZP5xizetR0HyWBSlGrdYFUPJLuIl8A5_B17Rh_4oaoaCY=s0");
        
        urls.add("http://2.bp.blogspot.com/Hd0GkuW-WDAO7EpgTiwDGDKlNHF3u0ITg81Pb9rspEOgujMOuHo_KRnUD0katelV0301KWEPBj7D=s0");
        
        urls.add("http://2.bp.blogspot.com/TnjYj_S6fxEcR2jixUEySO9nYH2a1kuaIWFiGETkuKt4Q0Ko3G848olk0T11jf_4R9UWSWll8vtG=s0");
        
        urls.add("http://2.bp.blogspot.com/OdPj5FRVRf8gRxaoI6ozXhIFqs8iDzSuMD6KKD2b3RZ0hlq9jRyD8UJtEi-_k8U2p6NMpVN_DDZL=s0");
        
        urls.add("http://2.bp.blogspot.com/_uAJiTYIXqhK6CpByr4KVWBDkm-reWmJX5Wgd8jleLkZOG21VKuY4IAa-v_OJNmWrFYrtIGnXesb=s0");
        
        urls.add("http://2.bp.blogspot.com/N_6GOBmS5GwN2CQj_uUa2-NYXGVX4yhapYG5iKctlUETi8-mSuR62hmziWe9HmXb2vW_43gvSdk-=s0");
















        
		
		BufferedImage image = null;
	    try {
	    	for (int i = 0; i < urls.size(); i++) {
	    		System.out.println(i);
		        URL url = new URL(urls.get(i));
		        image = ImageIO.read(url);
		        if (image.getHeight() > 2700) {
		        	//do something
		        	image = image.getSubimage(0, 0, image.getWidth(), 2700);
		        }
		        File outputfile = new File("output" + File.separator + "page." + i + ".png");
		        ImageIO.write(image, "png", outputfile);
	    	}
	    } catch (IOException e) {
	        e.printStackTrace();
	    }
		
	}

}
