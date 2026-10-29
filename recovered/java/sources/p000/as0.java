            package p000;

            import android.content.Context;
            import android.content.pm.ApplicationInfo;
            import android.content.pm.PackageInfo;
            import android.content.pm.Signature;
            import android.content.pm.SigningInfo;
            import android.os.Build;
            import com.google.android.gms.internal.common.zzad;
            import com.google.android.gms.internal.common.zzah;
            import com.google.android.gms.internal.common.zzal;
            import com.google.android.gms.internal.common.zzr;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.Serializable;
            import java.util.ArrayList;
            import java.util.Arrays;
            import java.util.List;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.functions.Function1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class as0 {

                /* JADX INFO: renamed from: c */
                public static as0 f2072c;

                /* JADX INFO: renamed from: a */
                public final Object f2073a;

                /* JADX INFO: renamed from: b */
                public volatile Object f2074b;

                public as0() {
/* 9 */             this.f2073a = new ArrayList();
                }

                /* JADX INFO: renamed from: b */
                public static as0 m1153b(Context context) {
/* 1 */             kb1.m6061n(context);
                    synchronized (as0.class) {
/* 9 */                 if (f2072c == null) {
/* 11 */                    uf3 uf3Var = ko3.f12903a;
                            synchronized (ko3.class) {
/* 18 */                        if (ko3.f12907e == null) {
/* 24 */                            ko3.f12907e = context.getApplicationContext();
                                } else {
/* 34 */                            AbstractC1245n0.m4889q("GoogleCertificates", "GoogleCertificates has been initialized already");
                                }
                            }
/* 43 */                    f2072c = new as0(context);
                        }
                    }
/* 51 */            return f2072c;
                }

                /* JADX WARN: Multi-variable type inference failed */
                /* JADX INFO: renamed from: e */
                public static final boolean m1154e(PackageInfo packageInfo, boolean z) {
                    zzah zzahVarZzj;
/* 2 */             if (packageInfo != null) {
/* 7 */                 if (z && ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName))) {
/* 29 */                    ApplicationInfo applicationInfo = packageInfo.applicationInfo;
/* 41 */                    z = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
                        }
                        try {
/* 47 */                    zzah zzahVar = z ? en3.f7814c : en3.f7813b;
/* 49 */                    int i = Build.VERSION.SDK_INT;
/* 53 */                    if (i < 28) {
/* 55 */                        Signature[] signatureArr = packageInfo.signatures;
/* 57 */                        byte[] byteArray = null;
/* 58 */                        if (signatureArr != null && signatureArr.length == 1) {
/* 65 */                            byteArray = signatureArr[0].toByteArray();
                                }
/* 76 */                        zzahVarZzj = byteArray != null ? zzah.zzk(byteArray) : zzah.zzj();
                            } else {
/* 86 */                        zzr.zza(i >= 28);
/* 1 */                         SigningInfo signingInfo = packageInfo.signingInfo;
/* 93 */                        if (signingInfo == null || signingInfo.hasMultipleSigners() || signingInfo.getSigningCertificateHistory() == null) {
/* 140 */                           zzahVarZzj = zzah.zzj();
                                } else {
/* 108 */                           int i2 = zzah.zzd;
/* 112 */                           zzad zzadVar = new zzad();
/* 121 */                           for (Signature signature : signingInfo.getSigningCertificateHistory()) {
/* 129 */                               zzadVar.zzb(signature.toByteArray());
                                    }
/* 135 */                           zzahVarZzj = zzadVar.zzd();
                                }
                            }
/* 148 */                   if (zzahVarZzj.isEmpty()) {
/* 201 */                       throw new IllegalArgumentException("Unable to obtain package certificate history.");
                            }
/* 150 */                   zzah zzahVarZzh = zzahVarZzj.zzh();
/* 154 */                   int size = zzahVarZzh.size();
/* 158 */                   int i3 = 0;
/* 159 */                   while (i3 < size) {
/* 165 */                       byte[] bArr = (byte[]) zzahVarZzh.get(i3);
/* 167 */                       zzal zzalVarZzr = zzahVar.listIterator(0);
/* 189 */                       do {
/* 175 */                           int i4 = i3 + 1;
/* 177 */                           if (!zzalVarZzr.hasNext()) {
/* 192 */                               i3 = i4;
                                    }
/* 189 */                       } while (!Arrays.equals(bArr, (byte[]) zzalVarZzr.next()));
/* 6 */                         return true;
                            }
                        } catch (IllegalArgumentException unused) {
/* 223 */                   if ((z ? m1155f(packageInfo, en3.f7812a) : m1155f(packageInfo, en3.f7812a[0])) == null) {
/* 1 */                         return false;
                            }
                        }
                    }
/* 1 */             return false;
                }

                /* JADX INFO: renamed from: f */
                public static dk3 m1155f(PackageInfo packageInfo, dk3... dk3VarArr) {
/* 1 */             Signature[] signatureArr = packageInfo.signatures;
/* 4 */             if (signatureArr != null) {
/* 9 */                 if (signatureArr.length != 1) {
/* 15 */                    AbstractC1245n0.m4889q("GoogleSignatureVerifier", "Package has more than one signature.");
/* 3 */                     return null;
                        }
/* 30 */                al3 al3Var = new al3(packageInfo.signatures[0].toByteArray());
/* 34 */                for (int i = 0; i < dk3VarArr.length; i++) {
/* 42 */                    if (dk3VarArr[i].equals(al3Var)) {
/* 44 */                        return dk3VarArr[i];
                            }
                        }
                    }
/* 3 */             return null;
                }

                /* JADX INFO: renamed from: a */
                public void m1156a(Serializable serializable) {
/* 1 */             this.f2074b = serializable;
/* 3 */             Object obj = this.f2074b;
/* 5 */             if (obj == null) {
/* 45 */                return;
                    }
/* 12 */            List<Function1> listM6192K = CollectionsKt.m6192K((ArrayList) this.f2073a);
/* 20 */            ((ArrayList) this.f2073a).clear();
/* 31 */            for (Function1 function1 : listM6192K) {
/* 39 */                if (function1 != null) {
/* 41 */                    function1.invoke(obj);
                        }
                    }
                }

                /* JADX INFO: renamed from: c */
                public Object m1157c(Context context) {
/* 3 */             if (this.f2074b == null) {
                        synchronized (this) {
                            try {
/* 8 */                         if (this.f2074b == null) {
/* 18 */                            this.f2074b = ((C1697u2) this.f2073a).m5442f(context);
                                }
                            } catch (Throwable th) {
/* 26 */                        throw th;
                            }
                        }
                    }
/* 27 */            return this.f2074b;
                }

                /* JADX WARN: Failed to calculate best type for var: r9v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.calculateFromBounds(FixTypesVisitor.java:159)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.setBestType(FixTypesVisitor.java:136)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:241)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                	... 6 more
                 */
                /* JADX WARN: Failed to calculate best type for var: r9v2 ??
                jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
                	at java.base/java.util.ArrayList.forEach(Unknown Source)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
                	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
                Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                	... 7 more
                 */
                /*  JADX ERROR: Types fix failed
                    jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r9v2 ??, new type: int
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                    Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
                    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
                    	... 5 more
                    */
                /* JADX INFO: renamed from: d */
                public boolean m1158d(int r21) {
                    /*
                        Method dump skipped, instruction units count: 457
                        To view this dump add '--comments-level debug' option
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p000.as0.m1158d(int):boolean");
                }

/* 11 */        public as0(Context context) {
                    this.f2073a = context.getApplicationContext();
                }

/* 12 */        public as0(C1697u2 c1697u2) {
/* 14 */            this.f2074b = null;
/* 15 */            this.f2073a = c1697u2;
                }
            }
