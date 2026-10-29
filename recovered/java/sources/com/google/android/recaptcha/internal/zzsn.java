            package com.google.android.recaptcha.internal;

            import com.google.android.recaptcha.internal.zzsh;
            import com.google.android.recaptcha.internal.zzsn;
            import java.io.IOException;
            import java.io.InputStream;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import okhttp3.HttpUrl;
            import p000.AbstractC0208c9;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzsn<MessageType extends zzsn<MessageType, BuilderType>, BuilderType extends zzsh<MessageType, BuilderType>> extends zzpw<MessageType, BuilderType> {
                private static final Map zzb = new ConcurrentHashMap();
                private int zzd = -1;
                protected zzuw zzc = zzuw.zzc();

                public static zzst zzA() {
/* 1 */             return zzth.zzf();
                }

                public static zzsu zzB() {
/* 1 */             return zzud.zze();
                }

                public static zzsu zzC(zzsu zzsuVar) {
/* 1 */             int size = zzsuVar.size();
/* 6 */             return zzsuVar.zzd(size + size);
                }

                public static Object zzE(Method method, Object obj, Object... objArr) {
                    try {
/* 2 */                 return method.invoke(obj, objArr);
                    } catch (IllegalAccessException e) {
/* 35 */                ds0.m3198o("Couldn't use Java reflection to implement protocol message reflection.", e);
/* 1 */                 return null;
                    } catch (InvocationTargetException e2) {
/* 8 */                 Throwable cause = e2.getCause();
/* 14 */                if (cause instanceof RuntimeException) {
/* 31 */                    throw ((RuntimeException) cause);
                        }
/* 18 */                if (cause instanceof Error) {
/* 28 */                    throw ((Error) cause);
                        }
/* 22 */                ds0.m3198o("Unexpected exception thrown by generated accessor method.", cause);
/* 1 */                 return null;
                    }
                }

                public static Object zzF(zzts zztsVar, String str, Object[] objArr) {
/* 3 */             return new zzue(zztsVar, str, objArr);
                }

                public static void zzI(Class cls, zzsn zzsnVar) {
/* 1 */             zzsnVar.zzH();
/* 6 */             zzb.put(cls, zzsnVar);
                }

                private final int zzf(zzug zzugVar) {
/* 13 */            return zzuc.zza().zzb(getClass()).zza(this);
                }

                private static zzsn zzg(zzsn zzsnVar) throws zzsx {
/* 1 */             if (zzsnVar == null || zzj(zzsnVar, true)) {
/* 21 */                return zzsnVar;
                    }
/* 20 */            throw new zzuu(zzsnVar).zza();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static zzsn zzi(zzsn zzsnVar, byte[] bArr, int i, int i2, zzry zzryVar) throws zzsx {
/* 1 */             if (i2 == 0) {
/* 3 */                 return zzsnVar;
                    }
/* 4 */             zzsn zzsnVarZzv = zzsnVar.zzv();
                    try {
/* 16 */                zzug zzugVarZzb = zzuc.zza().zzb(zzsnVarZzv.getClass());
/* 28 */                zzugVarZzb.zzi(zzsnVarZzv, bArr, 0, i2, new zzqb(zzryVar));
/* 31 */                zzugVarZzb.zzf(zzsnVarZzv);
/* 34 */                return zzsnVarZzv;
                    } catch (zzsx e) {
/* 78 */                if (e.zzb()) {
/* 85 */                    throw new zzsx(e);
                        }
/* 86 */                throw e;
                    } catch (zzuu e2) {
/* 71 */                throw e2.zza();
                    } catch (IOException e3) {
/* 50 */                if (e3.getCause() instanceof zzsx) {
/* 58 */                    throw ((zzsx) e3.getCause());
                        }
/* 64 */                throw new zzsx(e3);
                    } catch (IndexOutOfBoundsException unused) {
/* 37 */                pk3.m7475k("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 40 */                return null;
                    }
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean zzj(zzsn zzsnVar, boolean z) {
/* 9 */             byte bByteValue = ((Byte) zzsnVar.zzh(1, null, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 32 */            boolean zZzl = zzuc.zza().zzb(zzsnVar.getClass()).zzl(zzsnVar);
/* 36 */            if (z) {
/* 44 */                zzsnVar.zzh(2, true != zZzl ? null : zzsnVar, null);
                    }
/* 47 */            return zZzl;
                }

                public static zzsm zzs(zzts zztsVar, Object obj, zzts zztsVar2, zzsq zzsqVar, int i, zzvg zzvgVar, Class cls) {
/* 19 */            return new zzsm(zztsVar, HttpUrl.FRAGMENT_ENCODE_SET, null, new zzsl(null, i, zzvgVar, false, false), cls);
                }

                public static zzsn zzu(Class cls) {
/* 1 */             Map map = zzb;
/* 7 */             zzsn zzsnVar = (zzsn) map.get(cls);
/* 9 */             if (zzsnVar == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 27 */                    zzsnVar = (zzsn) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 38 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 39 */            if (zzsnVar != null) {
/* 65 */                return zzsnVar;
                    }
/* 53 */            zzsn zzsnVar2 = (zzsn) ((zzsn) zzvc.zze(cls)).zzh(6, null, null);
/* 55 */            if (zzsnVar2 != null) {
/* 57 */                map.put(cls, zzsnVar2);
/* 60 */                return zzsnVar2;
                    }
/* 61 */            f42.m3664t();
/* 48 */            return null;
                }

                public static zzsn zzw(zzsn zzsnVar, InputStream inputStream) throws zzsx {
                    zzqq zzqoVar;
/* 1 */             if (inputStream == null) {
/* 3 */                 byte[] bArr = zzsv.zzb;
/* 5 */                 int length = bArr.length;
/* 7 */                 zzqoVar = zzqq.zzH(bArr, 0, 0, false);
                    } else {
/* 17 */                zzqoVar = new zzqo(inputStream, 4096, null);
                    }
/* 21 */            int i = zzry.zzb;
/* 23 */            int i2 = zzuc.zza;
/* 25 */            zzry zzryVar = zzry.zza;
/* 27 */            zzsn zzsnVarZzv = zzsnVar.zzv();
                    try {
/* 39 */                zzug zzugVarZzb = zzuc.zza().zzb(zzsnVarZzv.getClass());
/* 47 */                zzugVarZzb.zzh(zzsnVarZzv, zzqr.zzq(zzqoVar), zzryVar);
/* 50 */                zzugVarZzb.zzf(zzsnVarZzv);
/* 53 */                zzg(zzsnVarZzv);
/* 56 */                return zzsnVarZzv;
                    } catch (zzsx e) {
/* 107 */               if (e.zzb()) {
/* 114 */                   throw new zzsx(e);
                        }
/* 115 */               throw e;
                    } catch (zzuu e2) {
/* 101 */               throw e2.zza();
                    } catch (IOException e3) {
/* 81 */                if (e3.getCause() instanceof zzsx) {
/* 89 */                    throw ((zzsx) e3.getCause());
                        }
/* 95 */                throw new zzsx(e3);
                    } catch (RuntimeException e4) {
/* 64 */                if (e4.getCause() instanceof zzsx) {
/* 72 */                    throw ((zzsx) e4.getCause());
                        }
/* 73 */                throw e4;
                    }
                }

                public static zzsn zzx(zzsn zzsnVar, byte[] bArr) throws zzsx {
/* 1 */             int i = zzry.zzb;
/* 3 */             int i2 = zzuc.zza;
/* 9 */             zzsn zzsnVarZzi = zzi(zzsnVar, bArr, 0, bArr.length, zzry.zza);
/* 13 */            zzg(zzsnVarZzi);
/* 16 */            return zzsnVarZzi;
                }

                public static zzss zzy() {
/* 1 */             return zzso.zzf();
                }

                public static zzss zzz(zzss zzssVar) {
/* 1 */             int size = zzssVar.size();
/* 6 */             return zzssVar.zzd(size + size);
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 34 */            return zzuc.zza().zzb(getClass()).zzk(this, (zzsn) obj);
                }

                public final int hashCode() {
/* 5 */             if (zzL()) {
/* 18 */                return zzn();
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 17 */                return i;
                    }
/* 11 */            int iZzn = zzn();
/* 15 */            this.zza = iZzn;
/* 17 */            return iZzn;
                }

                public final String toString() {
/* 5 */             return zztu.zza(this, super.toString());
                }

                @Override // com.google.android.recaptcha.internal.zzts
                public final zzua zzD() {
/* 7 */             return (zzua) zzh(7, null, null);
                }

                public final void zzG() {
/* 13 */            zzuc.zza().zzb(getClass()).zzf(this);
/* 16 */            zzH();
                }

                public final void zzH() {
/* 7 */             this.zzd &= AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final void zzJ(int i) {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final boolean zzL() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                @Override // com.google.android.recaptcha.internal.zzpw
                public final int zza(zzug zzugVar) {
/* 7 */             if (zzL()) {
/* 9 */                 int iZza = zzugVar.zza(this);
/* 13 */                if (iZza >= 0) {
/* 15 */                    return iZza;
                        }
/* 20 */                f42.m3656l(fm0.m3781g(iZza, "serialized size must be non-negative, was "));
/* 23 */                return 0;
                    }
/* 30 */            int i = this.zzd & AbstractC0208c9.API_PRIORITY_OTHER;
/* 31 */            if (i != Integer.MAX_VALUE) {
/* 56 */                return i;
                    }
/* 33 */            int iZza2 = zzugVar.zza(this);
/* 37 */            if (iZza2 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
/* 47 */                return iZza2;
                    }
/* 52 */            f42.m3656l(fm0.m3781g(iZza2, "serialized size must be non-negative, was "));
/* 23 */            return 0;
                }

                @Override // com.google.android.recaptcha.internal.zzts
                public final /* synthetic */ zztr zzaf() {
/* 7 */             return (zzsh) zzh(5, null, null);
                }

                @Override // com.google.android.recaptcha.internal.zzts
                public final /* synthetic */ zztr zzag() {
/* 7 */             zzsh zzshVar = (zzsh) zzh(5, null, null);
/* 9 */             zzshVar.zzh(this);
/* 12 */            return zzshVar;
                }

                @Override // com.google.android.recaptcha.internal.zzts
                public final void zze(zzqv zzqvVar) throws IOException {
/* 17 */            zzuc.zza().zzb(getClass()).zzj(this, zzqw.zza(zzqvVar));
                }

                public abstract Object zzh(int i, Object obj, Object obj2);

                @Override // com.google.android.recaptcha.internal.zztt
                public final /* synthetic */ zzts zzm() {
/* 7 */             return (zzsn) zzh(6, null, null);
                }

                public final int zzn() {
/* 13 */            return zzuc.zza().zzb(getClass()).zzb(this);
                }

                @Override // com.google.android.recaptcha.internal.zzts
                public final int zzo() {
/* 8 */             if (zzL()) {
/* 10 */                int iZzf = zzf(null);
/* 14 */                if (iZzf >= 0) {
/* 16 */                    return iZzf;
                        }
/* 21 */                f42.m3656l(fm0.m3781g(iZzf, "serialized size must be non-negative, was "));
/* 24 */                return 0;
                    }
/* 31 */            int i = this.zzd & AbstractC0208c9.API_PRIORITY_OTHER;
/* 32 */            if (i != Integer.MAX_VALUE) {
/* 34 */                return i;
                    }
/* 35 */            int iZzf2 = zzf(null);
/* 39 */            if (iZzf2 >= 0) {
/* 47 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzf2;
/* 49 */                return iZzf2;
                    }
/* 54 */            f42.m3656l(fm0.m3781g(iZzf2, "serialized size must be non-negative, was "));
/* 24 */            return 0;
                }

                @Override // com.google.android.recaptcha.internal.zztt
                public final boolean zzp() {
/* 2 */             return zzj(this, true);
                }

                public final zzsh zzq() {
/* 7 */             return (zzsh) zzh(5, null, null);
                }

                public final zzsh zzr() {
/* 7 */             zzsh zzshVar = (zzsh) zzh(5, null, null);
/* 9 */             zzshVar.zzh(this);
/* 12 */            return zzshVar;
                }

                public final zzsn zzv() {
/* 7 */             return (zzsn) zzh(4, null, null);
                }
            }
