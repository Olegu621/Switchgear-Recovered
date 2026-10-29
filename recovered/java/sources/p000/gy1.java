            package p000;

            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Build;
            import java.io.File;
            import java.io.IOException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class gy1 {

                /* JADX INFO: renamed from: a */
                public static final u32 f8849a = new u32();

                /* JADX INFO: renamed from: b */
                public static final Object f8850b = new Object();

                /* JADX INFO: renamed from: c */
                public static zb0 f8851c = null;

                /* JADX INFO: renamed from: a */
                public static long m4040a(Context context) {
/* 5 */             PackageManager packageManager = context.getApplicationContext().getPackageManager();
                    return Build.VERSION.SDK_INT >= 33 ? ey1.m3612a(packageManager, context).lastUpdateTime : packageManager.getPackageInfo(context.getPackageName(), 0).lastUpdateTime;
                }

                /* JADX INFO: renamed from: b */
                public static zb0 m4041b() {
/* 5 */             zb0 zb0Var = new zb0(28);
/* 8 */             f8851c = zb0Var;
/* 12 */            f8849a.m6327j(zb0Var);
/* 15 */            return f8851c;
                }

                /* JADX INFO: renamed from: c */
                public static void m4042c(Context context, boolean z) {
                    fy1 fy1VarM3854a;
                    int i;
/* 1 */             if (z || f8851c == null) {
                        synchronized (f8850b) {
/* 12 */                    if (!z) {
                                try {
/* 16 */                            if (f8851c != null) {
/* 19 */                                return;
                                    }
                                } catch (Throwable th) {
/* 220 */                           throw th;
                                }
                            }
/* 23 */                    int i2 = Build.VERSION.SDK_INT;
/* 27 */                    if (i2 >= 28 && i2 != 30) {
/* 50 */                        File file = new File(new File("/data/misc/profiles/ref/", context.getPackageName()), "primary.prof");
/* 53 */                        long length = file.length();
/* 63 */                        int i3 = 0;
/* 73 */                        boolean z2 = file.exists() && length > 0;
/* 89 */                        File file2 = new File(new File("/data/misc/profiles/cur/0/", context.getPackageName()), "primary.prof");
/* 92 */                        long length2 = file2.length();
/* 108 */                       boolean z3 = file2.exists() && length2 > 0;
                                try {
/* 109 */                           long jM4040a = m4040a(context);
/* 121 */                           File file3 = new File(context.getFilesDir(), "profileInstalled");
/* 128 */                           if (file3.exists()) {
                                        try {
/* 130 */                                   fy1VarM3854a = fy1.m3854a(file3);
                                        } catch (IOException unused) {
/* 135 */                                   m4041b();
/* 213 */                                   return;
                                        }
                                    } else {
/* 140 */                               fy1VarM3854a = null;
                                    }
/* 142 */                           if (fy1VarM3854a != null && fy1VarM3854a.f8398c == jM4040a && (i = fy1VarM3854a.f8397b) != 2) {
/* 155 */                               i3 = i;
                                    } else if (z2) {
/* 159 */                               i3 = 1;
                                    } else if (z3) {
/* 163 */                               i3 = 2;
                                    }
/* 164 */                           if (z && z3 && i3 != 1) {
/* 170 */                               i3 = 2;
                                    }
/* 171 */                           if (fy1VarM3854a != null && fy1VarM3854a.f8397b == 2 && i3 == 1 && length < fy1VarM3854a.f8399d) {
/* 185 */                               i3 = 3;
                                    }
/* 190 */                           fy1 fy1Var = new fy1(1, i3, jM4040a, length2);
/* 193 */                           if (fy1VarM3854a == null || !fy1VarM3854a.equals(fy1Var)) {
                                        try {
/* 201 */                                   fy1Var.m3855b(file3);
                                        } catch (IOException unused2) {
                                        }
                                    }
/* 204 */                           m4041b();
/* 213 */                           return;
                                } catch (PackageManager.NameNotFoundException unused3) {
/* 209 */                           m4041b();
/* 213 */                           return;
                                }
                            }
/* 214 */                   m4041b();
                        }
                    }
                }
            }
