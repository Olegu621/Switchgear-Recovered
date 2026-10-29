            package p000;

            import android.content.Context;
            import android.content.Intent;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.net.Uri;
            import android.os.Build;
            import android.os.Bundle;
            import android.text.TextUtils;
            import com.google.android.gms.common.GooglePlayServicesIncorrectManifestValueException;
            import com.google.android.gms.common.GooglePlayServicesMissingManifestValueException;
            import com.google.android.gms.common.R$string;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class qr0 {

                /* JADX INFO: renamed from: a */
                public static final int f15711a;

                /* JADX INFO: renamed from: b */
                public static final qr0 f15712b;

                static {
/* 1 */             int i = wr0.f18787e;
/* 6 */             f15711a = 12451000;
/* 13 */            f15712b = new qr0();
                }

                /* JADX INFO: renamed from: a */
                public Intent m8003a(Context context, String str, int i) {
/* 4 */             if (i != 1 && i != 2) {
/* 11 */                if (i != 3) {
/* 10 */                    return null;
                        }
/* 16 */                Uri uriFromParts = Uri.fromParts("package", "com.google.android.gms", null);
/* 24 */                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
/* 27 */                intent.setData(uriFromParts);
/* 30 */                return intent;
                    }
/* 31 */            if (context != null && i13.m4442v(context)) {
/* 44 */                Intent intent2 = new Intent("com.google.android.clockwork.home.UPDATE_ANDROID_WEAR_ACTION");
/* 49 */                intent2.setPackage("com.google.android.wearable.app");
/* 52 */                return intent2;
                    }
/* 57 */            StringBuilder sb = new StringBuilder("gcore_");
/* 62 */            sb.append(f15711a);
/* 67 */            sb.append("-");
/* 74 */            if (!TextUtils.isEmpty(str)) {
/* 76 */                sb.append(str);
                    }
/* 79 */            sb.append("-");
/* 82 */            if (context != null) {
/* 88 */                sb.append(context.getPackageName());
                    }
/* 91 */            sb.append("-");
/* 94 */            if (context != null) {
                        try {
/* 111 */                   sb.append(g93.m3898a(context).m9214c(0, context.getPackageName()).versionCode);
                        } catch (PackageManager.NameNotFoundException unused) {
                        }
                    }
/* 114 */           String string = sb.toString();
/* 122 */           Intent intent3 = new Intent("android.intent.action.VIEW");
/* 137 */           Uri.Builder builderAppendQueryParameter = Uri.parse("market://details").buildUpon().appendQueryParameter("id", "com.google.android.gms");
/* 145 */           if (!TextUtils.isEmpty(string)) {
/* 149 */               builderAppendQueryParameter.appendQueryParameter("pcampaignid", string);
                    }
/* 156 */           intent3.setData(builderAppendQueryParameter.build());
/* 161 */           intent3.setPackage("com.android.vending");
/* 166 */           intent3.addFlags(524288);
/* 169 */           return intent3;
                }

                /* JADX INFO: renamed from: b */
                public int mo7541b(Context context) {
/* 3 */             return m8004c(context, f15711a);
                }

                /* JADX WARN: Code duplicated, block: B:102:0x0202  */
                /* JADX WARN: Code duplicated, block: B:103:0x0204  */
                /* JADX WARN: Code duplicated, block: B:123:0x01e5 A[EXC_TOP_SPLITTER, SYNTHETIC] */
                /* JADX WARN: Code duplicated, block: B:53:0x00e8  */
                /* JADX WARN: Code duplicated, block: B:79:0x0168  */
                /* JADX WARN: Code duplicated, block: B:84:0x018b  */
                /* JADX WARN: Code duplicated, block: B:86:0x0190  */
                /* JADX WARN: Code duplicated, block: B:87:0x0192  */
                /* JADX WARN: Code duplicated, block: B:90:0x0197  */
                /* JADX WARN: Code duplicated, block: B:92:0x019b  */
                /* JADX WARN: Code duplicated, block: B:93:0x01e1  */
                /* JADX WARN: Instruction removed from duplicated block: B:84:0x018b, please report this as an issue */
                /* JADX INFO: renamed from: c */
                public int m8004c(Context context, int i) {
                    boolean z;
                    PackageInfo packageInfo;
                    int i2;
                    int i3;
                    ApplicationInfo applicationInfo;
/* 1 */             int i4 = wr0.f18787e;
                    try {
/* 9 */                 context.getResources().getString(R$string.common_google_play_services_unknown_issue);
                    } catch (Throwable unused) {
/* 17 */                AbstractC1245n0.m4876d("GooglePlayServicesUtil", "The Google Play services resources were not found. Check your project configuration to ensure that the resources are included.");
                    }
/* 30 */            boolean zM9607b = true;
/* 31 */            if (!"com.google.android.gms".equals(context.getPackageName()) && !wr0.f18786d.get()) {
                        synchronized (de3.f7145e) {
                            try {
/* 48 */                        if (!de3.f7146f) {
/* 55 */                            de3.f7146f = true;
                                    try {
/* 71 */                                Bundle bundle = g93.m3898a(context).m9213b(128, context.getPackageName()).metaData;
/* 73 */                                if (bundle != null) {
/* 79 */                                    bundle.getString("com.google.app.id");
/* 88 */                                    de3.f7147g = bundle.getInt("com.google.android.gms.version");
                                        }
                                    } catch (PackageManager.NameNotFoundException e) {
/* 96 */                                AbstractC1245n0.m4893u("MetadataValueReader", "This should never happen.", e);
                                    }
                                }
                            } catch (Throwable th) {
/* 178 */                       throw th;
                            }
                        }
/* 100 */               int i5 = de3.f7147g;
/* 102 */               if (i5 == 0) {
/* 176 */                   throw new GooglePlayServicesMissingManifestValueException("A required meta-data tag in your app's AndroidManifest.xml does not exist.  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
                        }
/* 107 */               if (i5 != 12451000) {
/* 112 */                   int i6 = f15711a;
/* 137 */                   StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 104 + String.valueOf(i5).length() + 194);
/* 142 */                   sb.append("The meta-data tag in your app's AndroidManifest.xml does not have the right value.  Expected ");
/* 145 */                   sb.append(i6);
/* 150 */                   sb.append(" but found ");
/* 153 */                   sb.append(i5);
/* 158 */                   sb.append(".  You must have the following declaration within the <application> element:     <meta-data android:name=\"com.google.android.gms.version\" android:value=\"@integer/google_play_services_version\" />");
/* 168 */                   throw new GooglePlayServicesIncorrectManifestValueException(sb.toString());
                        }
                    }
/* 184 */           if (i13.m4442v(context)) {
/* 233 */               z = false;
                    } else {
/* 188 */               if (i13.f9412o == null) {
/* 221 */                   i13.f9412o = Boolean.valueOf(j13.m5650l() ? context.getPackageManager().hasSystemFeature("android.hardware.type.embedded") : context.getPackageManager().hasSystemFeature("android.hardware.type.iot"));
                        }
/* 229 */               if (i13.f9412o.booleanValue()) {
/* 233 */                   z = false;
                        } else {
/* 231 */                   z = true;
                        }
                    }
/* 239 */           kb1.m6054g(i >= 0);
/* 242 */           String packageName = context.getPackageName();
/* 246 */           PackageManager packageManager = context.getPackageManager();
/* 252 */           int i7 = 9;
/* 254 */           if (z) {
                        try {
/* 268 */                   packageInfo = packageManager.getPackageInfo("com.android.vending", Build.VERSION.SDK_INT >= 28 ? 134225984 : 8256);
                        } catch (PackageManager.NameNotFoundException unused2) {
/* 285 */                   AbstractC1245n0.m4889q("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires the Google Play Store, but it is missing."));
                        }
                    } else {
/* 290 */               packageInfo = null;
                    }
                    try {
/* 303 */               PackageInfo packageInfo2 = packageManager.getPackageInfo("com.google.android.gms", Build.VERSION.SDK_INT >= 28 ? 134217792 : 64);
/* 307 */               as0.m1153b(context);
/* 314 */               if (!as0.m1154e(packageInfo2, true)) {
/* 328 */                   AbstractC1245n0.m4889q("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but their signature is invalid."));
                        } else if (z) {
/* 335 */                   kb1.m6061n(packageInfo);
/* 342 */                   if (!as0.m1154e(packageInfo, true)) {
/* 356 */                       AbstractC1245n0.m4889q("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature is invalid."));
                            } else if (z || packageInfo == null || packageInfo.signatures[0].equals(packageInfo2.signatures[0])) {
/* 396 */                       i2 = packageInfo2.versionCode;
/* 399 */                       if (i2 == -1) {
/* 401 */                           i3 = -1;
                                } else {
/* 403 */                           i3 = i2 / 1000;
                                }
/* 410 */                       if (i3 < (i != -1 ? i / 1000 : -1)) {
/* 444 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
/* 449 */                           sb2.append("Google Play services out of date for ");
/* 452 */                           sb2.append(packageName);
/* 457 */                           sb2.append(".  Requires ");
/* 460 */                           sb2.append(i);
/* 465 */                           sb2.append(" but found ");
/* 468 */                           sb2.append(i2);
/* 477 */                           AbstractC1245n0.m4889q("GooglePlayServicesUtil", sb2.toString());
/* 480 */                           i7 = 2;
                                } else {
/* 482 */                           applicationInfo = packageInfo2.applicationInfo;
/* 484 */                           if (applicationInfo == null) {
                                        try {
/* 488 */                                   applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                        } catch (PackageManager.NameNotFoundException e2) {
/* 506 */                                   AbstractC1245n0.m4893u("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they're missing when getting application info."), e2);
/* 509 */                                   i7 = 1;
                                        }
                                    }
/* 513 */                           if (applicationInfo.enabled) {
/* 517 */                               i7 = 0;
                                    } else {
/* 515 */                               i7 = 3;
                                    }
                                }
                            } else {
/* 391 */                       AbstractC1245n0.m4889q("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play Store, but its signature doesn't match that of Google Play services."));
                            }
                        } else if (z) {
/* 396 */                   i2 = packageInfo2.versionCode;
/* 399 */                   if (i2 == -1) {
/* 401 */                       i3 = -1;
                            } else {
/* 403 */                       i3 = i2 / 1000;
                            }
/* 410 */                   if (i3 < (i != -1 ? i / 1000 : -1)) {
/* 444 */                       StringBuilder sb3 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
/* 449 */                       sb3.append("Google Play services out of date for ");
/* 452 */                       sb3.append(packageName);
/* 457 */                       sb3.append(".  Requires ");
/* 460 */                       sb3.append(i);
/* 465 */                       sb3.append(" but found ");
/* 468 */                       sb3.append(i2);
/* 477 */                       AbstractC1245n0.m4889q("GooglePlayServicesUtil", sb3.toString());
/* 480 */                       i7 = 2;
                            } else {
/* 482 */                       applicationInfo = packageInfo2.applicationInfo;
/* 484 */                       if (applicationInfo == null) {
/* 488 */                           applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                }
/* 513 */                       if (applicationInfo.enabled) {
/* 515 */                           i7 = 3;
                                } else {
/* 517 */                           i7 = 0;
                                }
                            }
                        } else {
/* 396 */                   i2 = packageInfo2.versionCode;
/* 399 */                   if (i2 == -1) {
/* 401 */                       i3 = -1;
                            } else {
/* 403 */                       i3 = i2 / 1000;
                            }
/* 410 */                   if (i3 < (i != -1 ? i / 1000 : -1)) {
/* 444 */                       StringBuilder sb4 = new StringBuilder(String.valueOf(packageName).length() + 49 + String.valueOf(i).length() + 11 + String.valueOf(i2).length());
/* 449 */                       sb4.append("Google Play services out of date for ");
/* 452 */                       sb4.append(packageName);
/* 457 */                       sb4.append(".  Requires ");
/* 460 */                       sb4.append(i);
/* 465 */                       sb4.append(" but found ");
/* 468 */                       sb4.append(i2);
/* 477 */                       AbstractC1245n0.m4889q("GooglePlayServicesUtil", sb4.toString());
/* 480 */                       i7 = 2;
                            } else {
/* 482 */                       applicationInfo = packageInfo2.applicationInfo;
/* 484 */                       if (applicationInfo == null) {
/* 488 */                           applicationInfo = packageManager.getApplicationInfo("com.google.android.gms", 0);
                                }
/* 513 */                       if (applicationInfo.enabled) {
/* 515 */                           i7 = 3;
                                } else {
/* 517 */                           i7 = 0;
                                }
                            }
                        }
                    } catch (PackageManager.NameNotFoundException unused3) {
/* 531 */               AbstractC1245n0.m4889q("GooglePlayServicesUtil", String.valueOf(packageName).concat(" requires Google Play services, but they are missing."));
                    }
/* 537 */           if (i7 != 18) {
/* 547 */               zM9607b = i7 == 1 ? wr0.m9607b(context) : false;
                    }
/* 548 */           if (zM9607b) {
/* 535 */               return 18;
                    }
/* 551 */           return i7;
                }
            }
