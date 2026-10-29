            package p000;

            import android.content.pm.PackageInfo;
            import android.net.Uri;
            import android.os.Build;
            import java.lang.reflect.InvocationTargetException;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class z63 extends AbstractC1882l9 {

                /* JADX INFO: renamed from: d */
                public final Pattern f19956d;

                public z63() {
/* 3 */             super("ALGORITHMIC_DARKENING", "ALGORITHMIC_DARKENING");
/* 12 */            this.f19956d = Pattern.compile("\\A\\d+");
                }

                @Override // p000.AbstractC1882l9
                /* JADX INFO: renamed from: a */
                public final boolean mo6026a() {
                    return Build.VERSION.SDK_INT >= 33;
                }

                @Override // p000.AbstractC1882l9
                /* JADX INFO: renamed from: b */
                public final boolean mo97b() {
                    int i;
                    PackageInfo packageInfoM10118c;
/* 1 */             boolean zMo97b = super.mo97b();
/* 5 */             if (!zMo97b || (i = Build.VERSION.SDK_INT) >= 29) {
/* 74 */                return zMo97b;
                    }
/* 14 */            Uri uri = y63.f19511a;
/* 18 */            if (i >= 26) {
/* 20 */                packageInfoM10118c = AbstractC2099q9.m7736a();
                    } else {
                        try {
/* 25 */                    packageInfoM10118c = y63.m10118c();
                        } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
/* 30 */                    packageInfoM10118c = null;
                        }
                    }
/* 31 */            if (packageInfoM10118c == null) {
/* 72 */                return false;
                    }
/* 38 */            Matcher matcher = this.f19956d.matcher(packageInfoM10118c.versionName);
                    return matcher.find() && Integer.parseInt(packageInfoM10118c.versionName.substring(matcher.start(), matcher.end())) >= 105;
                }
            }
