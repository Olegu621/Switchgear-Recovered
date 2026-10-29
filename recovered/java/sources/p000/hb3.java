            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.content.res.Resources;
            import android.text.TextUtils;
            import com.google.android.gms.base.R$string;
            import io.flutter.plugin.editing.FlutterTextUtils;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Locale;
            import okhttp3.internal.p013ws.WebSocketProtocol;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class hb3 {

                /* JADX INFO: renamed from: a */
                public static final le2 f9002a = new le2();

                /* JADX INFO: renamed from: b */
                public static Locale f9003b;

                /* JADX INFO: renamed from: a */
                public static String m4158a(Context context) {
/* 1 */             String packageName = context.getPackageName();
                    try {
/* 9 */                 Context context2 = g93.m3898a(context).f17850a;
/* 28 */                return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
                    } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
/* 37 */                String str = context.getApplicationInfo().name;
                        return TextUtils.isEmpty(str) ? packageName : str;
                    }
                }

                /* JADX INFO: renamed from: b */
                public static String m4159b(Context context, int i) {
/* 1 */             Resources resources = context.getResources();
/* 5 */             String strM4158a = m4158a(context);
/* 10 */            if (i == 1) {
/* 144 */               return resources.getString(R$string.common_google_play_services_install_text, strM4158a);
                    }
/* 13 */            if (i == 2) {
                        return i13.m4442v(context) ? resources.getString(R$string.common_google_play_services_wear_update_text) : resources.getString(R$string.common_google_play_services_update_text, strM4158a);
                    }
/* 16 */            if (i == 3) {
/* 109 */               return resources.getString(R$string.common_google_play_services_enable_text, strM4158a);
                    }
/* 19 */            if (i == 5) {
/* 98 */                return m4161d(context, "common_google_play_services_invalid_account_text", strM4158a);
                    }
/* 22 */            if (i == 7) {
/* 91 */                return m4161d(context, "common_google_play_services_network_error_text", strM4158a);
                    }
/* 26 */            if (i == 9) {
/* 84 */                return resources.getString(R$string.common_google_play_services_unsupported_text, strM4158a);
                    }
/* 30 */            if (i == 20) {
/* 73 */                return m4161d(context, "common_google_play_services_restricted_profile_text", strM4158a);
                    }
                    switch (i) {
                        case 16:
/* 66 */                    return m4161d(context, "common_google_play_services_api_unavailable_text", strM4158a);
                        case 17:
/* 59 */                    return m4161d(context, "common_google_play_services_sign_in_failed_text", strM4158a);
                        case 18:
/* 52 */                    return resources.getString(R$string.common_google_play_services_updating_text, strM4158a);
                        default:
/* 41 */                    return resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue, strM4158a);
                    }
                }

                /* JADX INFO: renamed from: c */
                public static String m4160c(Context context, int i) {
/* 1 */             Resources resources = context.getResources();
                    switch (i) {
                        case 1:
/* 124 */                   return resources.getString(R$string.common_google_play_services_install_title);
                        case 2:
/* 117 */                   return resources.getString(R$string.common_google_play_services_update_title);
                        case 3:
/* 110 */                   return resources.getString(R$string.common_google_play_services_enable_title);
                        case 4:
                        case 6:
                        case 18:
/* 5 */                     return null;
                        case 5:
/* 97 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
/* 102 */                   return m4162e(context, "common_google_play_services_invalid_account_title");
                        case 7:
/* 85 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "Network error occurred. Please retry request later.");
/* 90 */                    return m4162e(context, "common_google_play_services_network_error_title");
                        case 8:
/* 79 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
/* 5 */                     return null;
                        case 9:
/* 73 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
/* 5 */                     return null;
                        case 10:
/* 67 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
/* 5 */                     return null;
                        case 11:
/* 61 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "The application is not licensed to the user.");
/* 5 */                     return null;
                        case 12:
                        case FlutterTextUtils.CARRIAGE_RETURN /* 13 */:
                        case 14:
                        case WebSocketProtocol.B0_MASK_OPCODE /* 15 */:
                        case 19:
                        default:
/* 25 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "Unexpected error code " + i);
/* 5 */                     return null;
                        case 16:
/* 55 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
/* 5 */                     return null;
                        case 17:
/* 43 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "The specified account could not be signed in.");
/* 48 */                    return m4162e(context, "common_google_play_services_sign_in_failed_title");
                        case 20:
/* 31 */                    AbstractC1245n0.m4876d("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
/* 36 */                    return m4162e(context, "common_google_play_services_restricted_profile_title");
                    }
                }

                /* JADX INFO: renamed from: d */
                public static String m4161d(Context context, String str, String str2) {
/* 1 */             Resources resources = context.getResources();
/* 5 */             String strM4162e = m4162e(context, str);
/* 9 */             if (strM4162e == null) {
/* 13 */                strM4162e = resources.getString(com.google.android.gms.common.R$string.common_google_play_services_unknown_issue);
                    }
/* 27 */            return String.format(resources.getConfiguration().locale, strM4162e, str2);
                }

                /* JADX INFO: renamed from: e */
                public static String m4162e(Context context, String str) {
                    Resources resourcesForApplication;
/* 5 */             le2 le2Var = f9002a;
                    synchronized (le2Var) {
                        try {
/* 23 */                    Locale locale = AbstractC2311vy.m9353a(context.getResources().getConfiguration()).get(0);
/* 33 */                    if (!locale.equals(f9003b)) {
/* 35 */                        le2Var.clear();
/* 38 */                        f9003b = locale;
                            }
/* 48 */                    String str2 = (String) le2Var.getOrDefault(str, null);
/* 50 */                    if (str2 != null) {
/* 53 */                        return str2;
                            }
/* 54 */                    int i = wr0.f18787e;
                            try {
/* 62 */                        resourcesForApplication = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                            } catch (PackageManager.NameNotFoundException unused) {
/* 67 */                        resourcesForApplication = null;
                            }
/* 68 */                    if (resourcesForApplication != null) {
/* 76 */                        int identifier = resourcesForApplication.getIdentifier(str, "string", "com.google.android.gms");
/* 80 */                        if (identifier == 0) {
/* 88 */                            AbstractC1245n0.m4889q("GoogleApiAvailability", "Missing resource: ".concat(str));
                                } else {
/* 93 */                            String string = resourcesForApplication.getString(identifier);
/* 101 */                           if (!TextUtils.isEmpty(string)) {
/* 116 */                               f9002a.put(str, string);
/* 120 */                               return string;
                                    }
/* 109 */                           AbstractC1245n0.m4889q("GoogleApiAvailability", "Got empty resource: ".concat(str));
                                }
                            }
/* 43 */                    return null;
                        } catch (Throwable th) {
/* 122 */                   throw th;
                        }
                    }
                }
            }
