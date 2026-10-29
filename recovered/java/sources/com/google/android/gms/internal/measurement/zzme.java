            package com.google.android.gms.internal.measurement;

            import com.google.android.gms.internal.measurement.zzma;
            import com.google.android.gms.internal.measurement.zzme;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.AbstractC0208c9;
            import p000.ds0;
            import p000.f42;
            import p000.pk3;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzme<MessageType extends zzme<MessageType, BuilderType>, BuilderType extends zzma<MessageType, BuilderType>> extends zzkr<MessageType, BuilderType> {
                private static final Map zzd = new ConcurrentHashMap();
                private int zzb = -1;
                protected zzoi zzc = zzoi.zza();

                private final int zzc(zznw zznwVar) {
/* 13 */            return zznt.zza().zzb(getClass()).zze(this);
                }

                public static zzme zzco(Class cls) {
/* 1 */             Map map = zzd;
/* 7 */             zzme zzmeVar = (zzme) map.get(cls);
/* 9 */             if (zzmeVar == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 27 */                    zzmeVar = (zzme) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 38 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 39 */            if (zzmeVar != null) {
/* 65 */                return zzmeVar;
                    }
/* 53 */            zzme zzmeVar2 = (zzme) ((zzme) zzoo.zzc(cls)).zzl(6, null, null);
/* 55 */            if (zzmeVar2 != null) {
/* 57 */                map.put(cls, zzmeVar2);
/* 60 */                return zzmeVar2;
                    }
/* 61 */            f42.m3664t();
/* 48 */            return null;
                }

                public static void zzcp(Class cls, zzme zzmeVar) {
/* 1 */             zzmeVar.zzcg();
/* 6 */             zzd.put(cls, zzmeVar);
                }

                public static Object zzcq(zznl zznlVar, String str, Object[] objArr) {
/* 3 */             return new zznv(zznlVar, str, objArr);
                }

                public static Object zzcr(Method method, Object obj, Object... objArr) {
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

                public static zzml zzcs() {
/* 1 */             return zzmf.zzd();
                }

                public static zzmm zzct() {
/* 1 */             return zzmz.zze();
                }

                public static zzmm zzcu(zzmm zzmmVar) {
/* 1 */             int size = zzmmVar.size();
/* 6 */             return zzmmVar.zzg(size + size);
                }

                public static zzmn zzcv() {
/* 1 */             return zznu.zzd();
                }

                public static zzmn zzcw(zzmn zzmnVar) {
/* 1 */             int size = zzmnVar.size();
/* 6 */             return zzmnVar.zzg(size + size);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final boolean zzd(zzme zzmeVar, boolean z) {
/* 9 */             byte bByteValue = ((Byte) zzmeVar.zzl(1, null, null)).byteValue();
/* 13 */            if (bByteValue == 1) {
/* 1 */                 return true;
                    }
/* 16 */            if (bByteValue == 0) {
/* 18 */                return false;
                    }
/* 32 */            boolean zZzk = zznt.zza().zzb(zzmeVar.getClass()).zzk(zzmeVar);
/* 36 */            if (z) {
/* 44 */                zzmeVar.zzl(2, true != zZzk ? null : zzmeVar, null);
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
/* 34 */            return zznt.zza().zzb(getClass()).zzb(this, (zzme) obj);
                }

                public final int hashCode() {
/* 5 */             if (zzcf()) {
/* 18 */                return zzci();
                    }
/* 7 */             int i = this.zza;
/* 9 */             if (i != 0) {
/* 17 */                return i;
                    }
/* 11 */            int iZzci = zzci();
/* 15 */            this.zza = iZzci;
/* 17 */            return iZzci;
                }

                public final String toString() {
/* 5 */             return zznn.zza(this, super.toString());
                }

                @Override // com.google.android.gms.internal.measurement.zznl
                public final void zzcB(zzll zzllVar) throws IOException {
/* 17 */            zznt.zza().zzb(getClass()).zzf(this, zzlm.zza(zzllVar));
                }

                @Override // com.google.android.gms.internal.measurement.zznl
                public final /* synthetic */ zznk zzcC() {
/* 7 */             return (zzma) zzl(5, null, null);
                }

                @Override // com.google.android.gms.internal.measurement.zznm
                public final boolean zzcD() {
/* 2 */             return zzd(this, true);
                }

                @Override // com.google.android.gms.internal.measurement.zznm
                public final /* synthetic */ zznl zzcE() {
/* 7 */             return (zzme) zzl(6, null, null);
                }

                @Override // com.google.android.gms.internal.measurement.zzkr
                public final int zzcd(zznw zznwVar) {
/* 5 */             if (zzcf()) {
/* 7 */                 int iZze = zznwVar.zze(this);
/* 11 */                if (iZze >= 0) {
/* 13 */                    return iZze;
                        }
/* 24 */                pk3.m7466b(String.valueOf(iZze).length() + 42, iZze);
/* 27 */                return 0;
                    }
/* 34 */            int i = this.zzb & AbstractC0208c9.API_PRIORITY_OTHER;
/* 35 */            if (i != Integer.MAX_VALUE) {
/* 66 */                return i;
                    }
/* 37 */            int iZze2 = zznwVar.zze(this);
/* 41 */            if (iZze2 >= 0) {
/* 49 */                this.zzb = (this.zzb & Integer.MIN_VALUE) | iZze2;
/* 51 */                return iZze2;
                    }
/* 62 */            pk3.m7466b(String.valueOf(iZze2).length() + 42, iZze2);
/* 27 */            return 0;
                }

                public final boolean zzcf() {
                    return (this.zzb & Integer.MIN_VALUE) != 0;
                }

                public final void zzcg() {
/* 7 */             this.zzb &= AbstractC0208c9.API_PRIORITY_OTHER;
                }

                public final zzme zzch() {
/* 7 */             return (zzme) zzl(4, null, null);
                }

                public final int zzci() {
/* 13 */            return zznt.zza().zzb(getClass()).zzc(this);
                }

                public final void zzcj() {
/* 13 */            zznt.zza().zzb(getClass()).zzj(this);
/* 16 */            zzcg();
                }

                public final zzma zzck() {
/* 7 */             return (zzma) zzl(5, null, null);
                }

                public final zzma zzcl() {
/* 7 */             zzma zzmaVar = (zzma) zzl(5, null, null);
/* 9 */             zzmaVar.zzbd(this);
/* 12 */            return zzmaVar;
                }

                public final void zzcm(int i) {
/* 10 */            this.zzb = (this.zzb & Integer.MIN_VALUE) | AbstractC0208c9.API_PRIORITY_OTHER;
                }

                @Override // com.google.android.gms.internal.measurement.zznl
                public final int zzcn() {
/* 6 */             if (zzcf()) {
/* 8 */                 int iZzc = zzc(null);
/* 12 */                if (iZzc >= 0) {
/* 14 */                    return iZzc;
                        }
/* 25 */                pk3.m7466b(String.valueOf(iZzc).length() + 42, iZzc);
/* 28 */                return 0;
                    }
/* 35 */            int i = this.zzb & AbstractC0208c9.API_PRIORITY_OTHER;
/* 36 */            if (i != Integer.MAX_VALUE) {
/* 38 */                return i;
                    }
/* 39 */            int iZzc2 = zzc(null);
/* 43 */            if (iZzc2 >= 0) {
/* 51 */                this.zzb = (this.zzb & Integer.MIN_VALUE) | iZzc2;
/* 53 */                return iZzc2;
                    }
/* 64 */            pk3.m7466b(String.valueOf(iZzc2).length() + 42, iZzc2);
/* 28 */            return 0;
                }

                public abstract Object zzl(int i, Object obj, Object obj2);
            }
