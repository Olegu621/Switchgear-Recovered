            package com.google.android.gms.internal.play_billing;

            import com.google.android.gms.internal.play_billing.zzhg;
            import com.google.android.gms.internal.play_billing.zzhk;
            import io.sentry.C1697u2;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.AbstractC0208c9;
            import p000.ds0;
            import p000.f42;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzhk<MessageType extends zzhk<MessageType, BuilderType>, BuilderType extends zzhg<MessageType, BuilderType>> extends zzfv<MessageType, BuilderType> {
                private static final Map zzb = new ConcurrentHashMap();
                private int zzd = -1;
                protected zzjk zzc = zzjk.zzc();

                private static zzhk zzB(zzhk zzhkVar, byte[] bArr, int i, int i2, zzgw zzgwVar) throws zzhr {
/* 1 */             if (i2 == 0) {
/* 3 */                 return zzhkVar;
                    }
/* 4 */             zzhk zzhkVarZzp = zzhkVar.zzp();
                    try {
/* 16 */                zzix zzixVarZzb = zziu.zza().zzb(zzhkVarZzp.getClass());
/* 28 */                zzixVarZzb.zzh(zzhkVarZzp, bArr, 0, i2, new zzfz(zzgwVar));
/* 31 */                zzixVarZzb.zzf(zzhkVarZzp);
/* 34 */                return zzhkVarZzp;
                    } catch (zzhr e) {
/* 74 */                throw e;
                    } catch (zzji e2) {
/* 71 */                throw e2.zza();
                    } catch (IOException e3) {
/* 50 */                if (e3.getCause() instanceof zzhr) {
/* 58 */                    throw ((zzhr) e3.getCause());
                        }
/* 64 */                throw new zzhr(e3);
                    } catch (IndexOutOfBoundsException unused) {
/* 37 */                C1697u2.m5436l("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
/* 40 */                return null;
                    }
                }

                private final int zzc(zzix zzixVar) {
/* 13 */            return zziu.zza().zzb(getClass()).zza(this);
                }

                public static zzhk zzo(Class cls) {
/* 1 */             Map map = zzb;
/* 7 */             zzhk zzhkVar = (zzhk) map.get(cls);
/* 9 */             if (zzhkVar == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 27 */                    zzhkVar = (zzhk) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 38 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 39 */            if (zzhkVar != null) {
/* 65 */                return zzhkVar;
                    }
/* 53 */            zzhk zzhkVar2 = (zzhk) ((zzhk) zzjq.zze(cls)).zzd(6, null, null);
/* 55 */            if (zzhkVar2 != null) {
/* 57 */                map.put(cls, zzhkVar2);
/* 60 */                return zzhkVar2;
                    }
/* 61 */            f42.m3664t();
/* 48 */            return null;
                }

                public static zzhk zzq(zzhk zzhkVar, byte[] bArr, zzgw zzgwVar) throws zzhr {
/* 3 */             zzhk zzhkVarZzB = zzB(zzhkVar, bArr, 0, bArr.length, zzgwVar);
/* 7 */             if (zzhkVarZzB == null || zzz(zzhkVarZzB, true)) {
/* 27 */                return zzhkVarZzB;
                    }
/* 26 */            throw new zzji(zzhkVarZzB).zza();
                }

                public static zzhn zzr() {
/* 1 */             return zzhl.zzf();
                }

                public static zzho zzs() {
/* 1 */             return zziv.zze();
                }

                public static Object zzt(Method method, Object obj, Object... objArr) {
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

                public static Object zzu(zzim zzimVar, String str, Object[] objArr) {
/* 3 */             return new zziw(zzimVar, str, objArr);
                }

                public static void zzx(Class cls, zzhk zzhkVar) {
/* 1 */             zzhkVar.zzw();
/* 6 */             zzb.put(cls, zzhkVar);
                }

                public static final boolean zzz(zzhk zzhkVar, boolean z) {
/* 9 */             byte bByteValue = ((Byte) zzhkVar.zzd(1, null, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 32 */            boolean zZzk = zziu.zza().zzb(zzhkVar.getClass()).zzk(zzhkVar);
/* 36 */            if (z) {
/* 44 */                zzhkVar.zzd(2, true != zZzk ? null : zzhkVar, null);
                    }
/* 47 */            return zZzk;
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj == null || getClass() != obj.getClass()) {
/* 5 */                 return false;
                    }
/* 34 */            return zziu.zza().zzb(getClass()).zzj(this, (zzhk) obj);
                }

                public final int hashCode() {
/* 5 */             if (zzA()) {
/* 18 */                return zzj();
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 17 */                return i;
                    }
/* 11 */            int iZzj = zzj();
/* 15 */            this.zza = iZzj;
/* 17 */            return iZzj;
                }

                public final String toString() {
/* 5 */             return zzio.zza(this, super.toString());
                }

                public final boolean zzA() {
                    return (this.zzd & Integer.MIN_VALUE) != 0;
                }

                @Override // com.google.android.gms.internal.play_billing.zzim
                public final /* synthetic */ zzil zzI() {
/* 7 */             return (zzhg) zzd(5, null, null);
                }

                @Override // com.google.android.gms.internal.play_billing.zzim
                public final void zzJ(zzgr zzgrVar) throws IOException {
/* 17 */            zziu.zza().zzb(getClass()).zzi(this, zzgs.zza(zzgrVar));
                }

                public abstract Object zzd(int i, Object obj, Object obj2);

                @Override // com.google.android.gms.internal.play_billing.zzfv
                public final int zze(zzix zzixVar) {
/* 7 */             if (zzA()) {
/* 9 */                 int iZza = zzixVar.zza(this);
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
/* 33 */            int iZza2 = zzixVar.zza(this);
/* 37 */            if (iZza2 >= 0) {
/* 45 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZza2;
/* 47 */                return iZza2;
                    }
/* 52 */            f42.m3656l(fm0.m3781g(iZza2, "serialized size must be non-negative, was "));
/* 23 */            return 0;
                }

                @Override // com.google.android.gms.internal.play_billing.zzin
                public final /* synthetic */ zzim zzi() {
/* 7 */             return (zzhk) zzd(6, null, null);
                }

                public final int zzj() {
/* 13 */            return zziu.zza().zzb(getClass()).zzb(this);
                }

                @Override // com.google.android.gms.internal.play_billing.zzim
                public final int zzk() {
/* 8 */             if (zzA()) {
/* 10 */                int iZzc = zzc(null);
/* 14 */                if (iZzc >= 0) {
/* 16 */                    return iZzc;
                        }
/* 21 */                f42.m3656l(fm0.m3781g(iZzc, "serialized size must be non-negative, was "));
/* 24 */                return 0;
                    }
/* 31 */            int i = this.zzd & AbstractC0208c9.API_PRIORITY_OTHER;
/* 32 */            if (i != Integer.MAX_VALUE) {
/* 34 */                return i;
                    }
/* 35 */            int iZzc2 = zzc(null);
/* 39 */            if (iZzc2 >= 0) {
/* 47 */                this.zzd = (this.zzd & Integer.MIN_VALUE) | iZzc2;
/* 49 */                return iZzc2;
                    }
/* 54 */            f42.m3656l(fm0.m3781g(iZzc2, "serialized size must be non-negative, was "));
/* 24 */            return 0;
                }

                @Override // com.google.android.gms.internal.play_billing.zzin
                public final boolean zzl() {
/* 2 */             return zzz(this, true);
                }

                public final zzhg zzm() {
/* 7 */             return (zzhg) zzd(5, null, null);
                }

                public final zzhg zzn() {
/* 7 */             zzhg zzhgVar = (zzhg) zzd(5, null, null);
/* 9 */             zzhgVar.zze(this);
/* 12 */            return zzhgVar;
                }

                public final zzhk zzp() {
/* 7 */             return (zzhk) zzd(4, null, null);
                }

                public final void zzv() {
/* 13 */            zziu.zza().zzb(getClass()).zzf(this);
/* 16 */            zzw();
                }

                public final void zzw() {
/* 7 */             this.zzd &= AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final void zzy(int i) {
/* 10 */            this.zzd = (this.zzd & Integer.MIN_VALUE) | AbstractC0208c9.API_PRIORITY_OTHER;
                }
            }
