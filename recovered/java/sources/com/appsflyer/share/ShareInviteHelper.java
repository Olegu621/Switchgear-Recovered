            package com.appsflyer.share;

            import android.content.Context;
            import android.text.TextUtils;
            import com.appsflyer.AFInAppEventParameterName;
            import com.appsflyer.AFInAppEventType;
            import com.appsflyer.AFLogger;
            import com.appsflyer.AppsFlyerLib;
            import com.appsflyer.AppsFlyerProperties;
            import com.appsflyer.internal.AFa1ySDK;
            import java.util.HashMap;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class ShareInviteHelper {
                public static LinkGenerator generateInviteUrl(Context context) {
/* 1 */             AppsFlyerLib appsFlyerLib = AppsFlyerLib.getInstance();
/* 5 */             String appsFlyerUID = appsFlyerLib.getAppsFlyerUID(context);
/* 15 */            String string = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_ID);
/* 25 */            String string2 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_DOMAIN);
/* 64 */            LinkGenerator linkGeneratorAddParameter = new LinkGenerator("af_app_invites").setBaseURL(string, string2, context.getPackageName()).setReferrerUID(appsFlyerUID).setReferrerCustomerId(AFa1ySDK.getMediationNetwork()).addParameter("af_siteid", context.getPackageName());
/* 74 */            String string3 = AppsFlyerProperties.getInstance().getString(AppsFlyerProperties.ONELINK_SCHEME);
/* 78 */            if (string3 != null && string3.length() > 3) {
/* 87 */                linkGeneratorAddParameter.setBaseDeeplink(string3);
                    }
/* 90 */            return linkGeneratorAddParameter;
                }

                public static void logInvite(Context context, String str, Map<String, String> map) {
/* 5 */             if (TextUtils.isEmpty(str)) {
/* 9 */                 AFLogger.afWarnLog("[Invite] Cannot report App-Invite with null/empty channel");
/* 12 */                return;
                    }
/* 24 */            if (AppsFlyerProperties.getInstance().getBoolean(AppsFlyerProperties.AF_WAITFOR_CUSTOMERID, false)) {
/* 29 */                AFLogger.afInfoLog("CustomerUserId not set, report Invite is disabled", true);
/* 32 */                return;
                    }
/* 33 */            LinkGenerator linkGeneratorGenerateInviteUrl = generateInviteUrl(context);
/* 37 */            linkGeneratorGenerateInviteUrl.addParameters(map);
/* 50 */            AFLogger.afDebugLog("[Invite] Reporting App-Invite via channel: ".concat(String.valueOf(str)));
/* 57 */            StringBuilder sb = new StringBuilder("[Invite] Generated URL: ");
/* 64 */            sb.append(linkGeneratorGenerateInviteUrl.generateLink());
/* 71 */            AFLogger.afDebugLog(sb.toString());
/* 74 */            String mediaSource = linkGeneratorGenerateInviteUrl.getMediaSource();
/* 84 */            if ("af_app_invites".equals(mediaSource)) {
/* 86 */                mediaSource = AFInAppEventType.INVITE;
                    } else if ("af_user_share".equals(mediaSource)) {
/* 97 */                mediaSource = AFInAppEventType.SHARE;
                    }
/* 101 */           HashMap map2 = new HashMap();
/* 108 */           if (linkGeneratorGenerateInviteUrl.getUserParams() != null) {
/* 114 */               map2.putAll(linkGeneratorGenerateInviteUrl.getUserParams());
                    }
/* 119 */           map2.put(AFInAppEventParameterName.AF_CHANNEL, str);
/* 126 */           AppsFlyerLib.getInstance().logEvent(context, mediaSource, map2);
                }
            }
