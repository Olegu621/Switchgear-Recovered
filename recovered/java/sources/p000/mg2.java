            package p000;

            import android.content.ComponentName;
            import android.content.Context;
            import android.content.pm.PackageInfo;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import android.os.Bundle;
            import java.util.HashSet;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mg2 {

                /* JADX INFO: renamed from: d */
                public static final HashSet f13762d = new HashSet();

                /* JADX INFO: renamed from: a */
                public final String f13763a;

                /* JADX INFO: renamed from: b */
                public final String f13764b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ int f13765c;

                public mg2(int i, String str, String str2) {
/* 1 */             this.f13765c = i;
/* 6 */             this.f13763a = str;
/* 8 */             this.f13764b = str2;
/* 12 */            f13762d.add(this);
                }

                /* JADX INFO: renamed from: a */
                public final boolean m6647a(Context context) {
/* 5 */             if (!m6648b()) {
/* 7 */                 PackageInfo packageInfoM10117b = y63.m10117b(context);
/* 11 */                Bundle bundle = null;
/* 12 */                if (packageInfoM10117b != null) {
/* 21 */                    ComponentName componentName = new ComponentName(packageInfoM10117b.packageName, "org.chromium.android_webview.services.StartupFeatureMetadataHolder");
                            try {
/* 28 */                        if (Build.VERSION.SDK_INT >= 33) {
/* 44 */                            bundle = AbstractC2285v9.m9230a(context.getPackageManager(), componentName, AbstractC2285v9.m9231b(640L)).metaData;
                                } else {
/* 57 */                            bundle = context.getPackageManager().getServiceInfo(componentName, 640).metaData;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
                            }
                        }
/* 70 */                if (!(bundle == null ? false : bundle.containsKey(this.f13764b))) {
/* 59 */                    return false;
                        }
                    }
/* 72 */            return true;
                }

                /* JADX INFO: renamed from: b */
                public final boolean m6648b() {
                    switch (this.f13765c) {
                        case 0:
/* 16 */                    return false;
                        default:
                            return Build.VERSION.SDK_INT >= 28;
                    }
                }
            }
