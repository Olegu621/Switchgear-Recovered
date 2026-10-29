            package com.appsflyer.deeplink;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.Arrays;
            import java.util.HashMap;
            import java.util.Iterator;
            import java.util.Map;
            import java.util.Set;
            import org.json.JSONException;
            import org.json.JSONObject;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class DeepLink {
                public final JSONObject AFAdRevenueData;

                private DeepLink(JSONObject jSONObject) {
/* 4 */             this.AFAdRevenueData = jSONObject;
                }

                public static DeepLink getMediationNetwork(JSONObject jSONObject) throws JSONException {
/* 3 */             JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("custom_params");
/* 7 */             if (jSONObjectOptJSONObject != null) {
/* 9 */                 jSONObject.remove("custom_params");
/* 12 */                Iterator<String> itKeys = jSONObjectOptJSONObject.keys();
/* 20 */                while (itKeys.hasNext()) {
/* 22 */                    String next = itKeys.next();
/* 32 */                    jSONObject.put(next, jSONObjectOptJSONObject.opt(next));
                        }
                    }
/* 38 */            return new DeepLink(jSONObject);
                }

                public static DeepLink getMonetizationNetwork(Map<String, String> map) throws JSONException {
/* 1 */             Set<String> setKeySet = map.keySet();
/* 209 */           setKeySet.removeAll(Arrays.asList("install_time", "pid", "c", "af_prt", "af_mp", "clickid", "af_siteid", "af_sub_siteid", "af_click_lookback", "af_viewthrough_lookback", "af_keywords", "af_cost_model", "af_cost_currency", "af_cost_value", "af_r", "af_web_dp", "af_force_deeplink", "af_ref", "is_incentivized", "af_param_forwarding", "is_retargeting", "af_reengagement_window", "is_branded_link", "is_universal_link", "af_generated_clk", FirebaseAnalytics.Param.TRANSACTION_ID, "af_fp_lookback_window", "af_vt_fp_lookback_window", "af_fp_priority", "af_generate_clk", "af_inactivity_window", "af_ol_red", "af_attr", "af_ol_lp", "af_blank_red", "af_source", "af_lp_src", "af_src_browser", "af_tranid", "af_wrt_clk", "af_ua", "af_ip", "af_lang", "advertising_id", "sha1_advertising_id", "md5_advertising_id", "android_id", "sha1_android_id", "md5_android_id", "imei", "sha1_imei", "md5_imei", "oaid", "sha1_oaid", "md5_oaid", "af_android_url", "sha1_el", "fire_advertising_id", "sha1_fire_advertising_id", "idfa", "md5_idfa", "af_ios_url", "af_ios_fallback", "sha1_idfa", "mac", "sha1_mac", "af_banner", "af_slk_web_endpoint", "af_chrome_lp", "af_android_custom_url", "af_ios_custom_url", "af_enc_data", "engmnt_source", "redirect_response_data", "shortlink", "advertiserId", "sha1_advertiserId", "advertiser_id", "sha1_advertiser_id", "muid", "idfv", "md5_idfv", "sha1_idfv", "af_installpostback", "http_referrer", "af_model", "af_os", "md5_advertiserId", "af_video_total_length", "af_video_played_length", "af_playable_played_length", "af_ad_time_viewed", "af_ad_displayed_percent", "af_audio_total_length", "af_audio_played_length", "af_status", "af_web_id", "af_deeplink"));
/* 214 */           HashMap map2 = new HashMap();
/* 225 */           for (String str : setKeySet) {
/* 241 */               map2.put(str, map.get(str));
                    }
/* 250 */           return getMediationNetwork(new JSONObject(map2));
                }

                public String getAfSub1() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("af_sub1");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getAfSub2() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("af_sub2");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getAfSub3() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("af_sub3");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getAfSub4() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("af_sub4");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getAfSub5() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("af_sub5");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getCampaign() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt(FirebaseAnalytics.Param.CAMPAIGN);
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getCampaignId() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt(FirebaseAnalytics.Param.CAMPAIGN_ID);
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public JSONObject getClickEvent() {
/* 1 */             return this.AFAdRevenueData;
                }

                public String getClickHttpReferrer() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("click_http_referrer");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getDeepLinkValue() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("deep_link_value");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getMatchType() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("match_type");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getMediaSource() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("media_source");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (String) objOpt;
                }

                public String getStringValue(String str) {
/* 3 */             Object objOpt = this.AFAdRevenueData.opt(str);
/* 10 */            if (objOpt == JSONObject.NULL) {
/* 12 */                objOpt = null;
                    }
/* 13 */            if (objOpt == null) {
/* 9 */                 return null;
                    }
/* 16 */            return String.valueOf(objOpt);
                }

                public Boolean isDeferred() {
/* 5 */             Object objOpt = this.AFAdRevenueData.opt("is_deferred");
/* 11 */            if (objOpt == JSONObject.NULL) {
/* 13 */                objOpt = null;
                    }
/* 14 */            return (Boolean) objOpt;
                }

                public String toString() {
/* 3 */             return this.AFAdRevenueData.toString();
                }
            }
