            package com.appsflyer.share;

            import android.content.Context;
            import com.appsflyer.AFInAppEventParameterName;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.CreateOneLinkHttpTask;
            import com.appsflyer.internal.AFa1ySDK;
            import com.appsflyer.internal.AFd1zSDK;
            import com.appsflyer.internal.AFe1gSDK;
            import com.appsflyer.internal.AFe1oSDK;
            import com.appsflyer.internal.AFe1oSDK.RunnableC02601;
            import com.appsflyer.internal.AFj1fSDK;
            import com.appsflyer.internal.AFk1uSDK;
            import java.util.HashMap;
            import java.util.Map;
            import java.util.UUID;
            import okhttp3.HttpUrl;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 147 */   public class LinkGenerator {
                String AFAdRevenueData;
                private String areAllFieldsValid;
                private String component1;
                private String component2;
                private String component3;
                private String component4;
                private final Map<String, String> copy = new HashMap();
                private String copydefault;
                private String getCurrencyIso4217Code;
                private final String getMediationNetwork;
                String getMonetizationNetwork;
                private String getRevenue;
                private String toString;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                public interface ResponseListener {
                    void onResponse(String str);

                    void onResponseError(String str);
                }

                public LinkGenerator(String str) {
/* 11 */            this.getMediationNetwork = str;
                }

                private Map<String, String> getCurrencyIso4217Code() {
/* 3 */             HashMap map = new HashMap();
/* 10 */            map.put("pid", this.getMediationNetwork);
/* 13 */            String str = this.areAllFieldsValid;
/* 15 */            if (str != null) {
/* 19 */                map.put("af_referrer_uid", str);
                    }
/* 22 */            String str2 = this.getCurrencyIso4217Code;
/* 24 */            if (str2 != null) {
/* 28 */                map.put(AFInAppEventParameterName.AF_CHANNEL, str2);
                    }
/* 31 */            String str3 = this.component3;
/* 33 */            if (str3 != null) {
/* 37 */                map.put("af_referrer_customer_id", str3);
                    }
/* 40 */            String str4 = this.getRevenue;
/* 42 */            if (str4 != null) {
/* 46 */                map.put("c", str4);
                    }
/* 49 */            String str5 = this.component4;
/* 51 */            if (str5 != null) {
/* 55 */                map.put("af_referrer_name", str5);
                    }
/* 58 */            String str6 = this.component2;
/* 60 */            if (str6 != null) {
/* 64 */                map.put("af_referrer_image_url", str6);
                    }
/* 69 */            if (this.toString != null) {
/* 73 */                StringBuilder sb = new StringBuilder();
/* 78 */                sb.append(this.toString);
/* 81 */                String str7 = this.component1;
/* 83 */                if (str7 != null) {
/* 87 */                    String str8 = HttpUrl.FRAGMENT_ENCODE_SET;
/* 93 */                    this.component1 = str7.replaceFirst("^[/]", HttpUrl.FRAGMENT_ENCODE_SET);
/* 103 */                   if (!this.toString.endsWith("/")) {
/* 97 */                        str8 = "/";
                            }
/* 106 */                   sb.append(str8);
/* 111 */                   sb.append(this.component1);
                        }
/* 120 */               map.put("af_dp", sb.toString());
                    }
/* 137 */           for (Map.Entry<String, String> entry : this.copy.entrySet()) {
/* 157 */               map.put(entry.getKey(), entry.getValue());
                    }
/* 161 */           return AFj1fSDK.getRevenue(map);
                }

                public LinkGenerator addParameter(String str, String str2) {
/* 3 */             this.copy.put(str, str2);
/* 6 */             return this;
                }

                public LinkGenerator addParameters(Map<String, String> map) {
/* 1 */             if (map != null) {
/* 5 */                 this.copy.putAll(map);
                    }
/* 8 */             return this;
                }

                public String generateLink() {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             String str = this.AFAdRevenueData;
/* 8 */             if (str == null || !str.startsWith("http")) {
/* 50 */                sb.append(String.format(AFk1uSDK.getCurrencyIso4217Code, AppsFlyerLib.getInstance().getHostPrefix(), AFa1ySDK.getRevenue().getHostName()));
                    } else {
/* 20 */                sb.append(this.AFAdRevenueData);
                    }
/* 55 */            if (this.getMonetizationNetwork != null) {
/* 59 */                sb.append('/');
/* 64 */                sb.append(this.getMonetizationNetwork);
                    }
/* 67 */            Map<String, String> currencyIso4217Code = getCurrencyIso4217Code();
/* 73 */            StringBuilder sb2 = new StringBuilder();
/* 88 */            for (Map.Entry<String, String> entry : currencyIso4217Code.entrySet()) {
/* 100 */               if (sb2.length() == 0) {
/* 104 */                   sb2.append('?');
                        } else {
/* 110 */                   sb2.append('&');
                        }
/* 119 */               sb2.append(entry.getKey());
/* 124 */               sb2.append('=');
/* 133 */               sb2.append(entry.getValue());
                    }
/* 141 */           sb.append(sb2.toString());
/* 144 */           return sb.toString();
                }

                public String getBrandDomain() {
/* 1 */             return this.copydefault;
                }

                public String getCampaign() {
/* 1 */             return this.getRevenue;
                }

                public String getChannel() {
/* 1 */             return this.getCurrencyIso4217Code;
                }

                public String getMediaSource() {
/* 1 */             return this.getMediationNetwork;
                }

                public Map<String, String> getUserParams() {
/* 5 */             return new HashMap(this.copy);
                }

                public LinkGenerator setBaseDeeplink(String str) {
/* 1 */             this.toString = str;
/* 3 */             return this;
                }

                public LinkGenerator setBaseURL(String str, String str2, String str3) {
/* 5 */             if (str == null || str.length() <= 0) {
/* 58 */                this.AFAdRevenueData = AbstractC0886en.m3509m("https://", AbstractC0886en.m3508l(AppsFlyerLib.getInstance().getHostPrefix(), "app.", AFa1ySDK.getRevenue().getHostName()), "/", str3);
/* 60 */                return this;
                    }
/* 14 */            if (str2 == null || str2.length() < 5) {
/* 23 */                str2 = "go.onelink.me";
                    }
/* 29 */            this.AFAdRevenueData = AbstractC0886en.m3509m("https://", str2, "/", str);
/* 31 */            return this;
                }

                public LinkGenerator setBrandDomain(String str) {
/* 1 */             this.copydefault = str;
/* 3 */             return this;
                }

                public LinkGenerator setCampaign(String str) {
/* 1 */             this.getRevenue = str;
/* 3 */             return this;
                }

                public LinkGenerator setChannel(String str) {
/* 1 */             this.getCurrencyIso4217Code = str;
/* 3 */             return this;
                }

                public LinkGenerator setDeeplinkPath(String str) {
/* 1 */             this.component1 = str;
/* 3 */             return this;
                }

                public LinkGenerator setReferrerCustomerId(String str) {
/* 1 */             this.component3 = str;
/* 3 */             return this;
                }

                public LinkGenerator setReferrerImageURL(String str) {
/* 1 */             this.component2 = str;
/* 3 */             return this;
                }

                public LinkGenerator setReferrerName(String str) {
/* 1 */             this.component4 = str;
/* 3 */             return this;
                }

                public LinkGenerator setReferrerUID(String str) {
/* 1 */             this.areAllFieldsValid = str;
/* 3 */             return this;
                }

/* 148 */       public void generateLink(Context context, ResponseListener responseListener) {
/* 149 */           String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
/* 150 */           String str = this.copydefault;
                    Map<String, String> currencyIso4217Code = getCurrencyIso4217Code();
/* 152 */           if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
/* 153 */               AFLogger.afInfoLog("CustomerUserId not set, generate User Invite Link is disabled", true);
                        return;
                    }
/* 154 */           AFa1ySDK.getRevenue().AFAdRevenueData(context);
/* 155 */           AFd1zSDK monetizationNetwork = AFa1ySDK.getRevenue().getMonetizationNetwork();
/* 156 */           AFe1gSDK aFe1gSDK = new AFe1gSDK(monetizationNetwork, UUID.randomUUID(), string, currencyIso4217Code, str, responseListener, this);
/* 158 */           AFe1oSDK aFe1oSDKCopydefault = monetizationNetwork.copydefault();
/* 159 */           aFe1oSDKCopydefault.getCurrencyIso4217Code.execute(aFe1oSDKCopydefault.new RunnableC02601(aFe1gSDK));
                }

                @Deprecated
/* 159 */       public void generateLink(Context context, final CreateOneLinkHttpTask.ResponseListener responseListener) {
/* 160 */           generateLink(context, new ResponseListener() { // from class: com.appsflyer.share.LinkGenerator.1
                        @Override // com.appsflyer.share.LinkGenerator.ResponseListener
                        public final void onResponse(String str) {
/* 3 */                     responseListener.onResponse(str);
                        }

                        @Override // com.appsflyer.share.LinkGenerator.ResponseListener
                        public final void onResponseError(String str) {
/* 3 */                     responseListener.onResponseError(str);
                        }
                    });
                }
            }
