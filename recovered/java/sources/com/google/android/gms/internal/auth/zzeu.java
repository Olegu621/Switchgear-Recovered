            package com.google.android.gms.internal.auth;

            import com.google.android.gms.internal.auth.zzes;
            import com.google.android.gms.internal.auth.zzeu;
            import java.io.IOException;
            import java.lang.reflect.InvocationTargetException;
            import java.lang.reflect.Method;
            import java.util.Map;
            import java.util.concurrent.ConcurrentHashMap;
            import p000.ds0;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzeu<MessageType extends zzeu<MessageType, BuilderType>, BuilderType extends zzes<MessageType, BuilderType>> extends zzdp<MessageType, BuilderType> {
                private static final Map zzb = new ConcurrentHashMap();
                protected zzgz zzc = zzgz.zza();

                public static zzeu zza(Class cls) {
/* 1 */             Map map = zzb;
/* 7 */             zzeu zzeuVar = (zzeu) map.get(cls);
/* 9 */             if (zzeuVar == null) {
                        try {
/* 20 */                    Class.forName(cls.getName(), true, cls.getClassLoader());
/* 27 */                    zzeuVar = (zzeu) map.get(cls);
                        } catch (ClassNotFoundException e) {
/* 38 */                    throw new IllegalStateException("Class initialization cannot fail.", e);
                        }
                    }
/* 39 */            if (zzeuVar != null) {
/* 65 */                return zzeuVar;
                    }
/* 53 */            zzeu zzeuVar2 = (zzeu) ((zzeu) zzhi.zze(cls)).zzi(6, null, null);
/* 55 */            if (zzeuVar2 != null) {
/* 57 */                map.put(cls, zzeuVar2);
/* 60 */                return zzeuVar2;
                    }
/* 61 */            f42.m3664t();
/* 48 */            return null;
                }

                /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
                
                    if (r1 != false) goto L17;
                 */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public static zzeu zzb(zzeu zzeuVar, byte[] bArr) throws zzfa {
                    byte bByteValue;
/* 5 */             zzeu zzeuVarZzj = zzj(zzeuVar, bArr, 0, bArr.length, zzek.zza);
/* 9 */             if (zzeuVarZzj != null && (bByteValue = ((Byte) zzeuVarZzj.zzi(1, null, null)).byteValue()) != 1) {
/* 26 */                if (bByteValue != 0) {
/* 40 */                    boolean zZzi = zzge.zza().zzb(zzeuVarZzj.getClass()).zzi(zzeuVarZzj);
/* 50 */                    zzeuVarZzj.zzi(2, true != zZzi ? null : zzeuVarZzj, null);
                        }
/* 61 */                zzfa zzfaVarZza = new zzgx(zzeuVarZzj).zza();
/* 65 */                zzfaVarZza.zze(zzeuVarZzj);
/* 68 */                throw zzfaVarZza;
                    }
/* 69 */            return zzeuVarZzj;
                }

                public static zzey zzc() {
/* 1 */             return zzgf.zze();
                }

                public static Object zze(Method method, Object obj, Object... objArr) {
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

                public static Object zzf(zzfw zzfwVar, String str, Object[] objArr) {
/* 5 */             return new zzgg(zzfwVar, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", objArr);
                }

                public static void zzg(Class cls, zzeu zzeuVar) {
/* 3 */             zzb.put(cls, zzeuVar);
                }

                private static zzeu zzj(zzeu zzeuVar, byte[] bArr, int i, int i2, zzek zzekVar) throws zzfa {
/* 8 */             zzeu zzeuVar2 = (zzeu) zzeuVar.zzi(4, null, null);
                    try {
/* 18 */                zzgh zzghVarZzb = zzge.zza().zzb(zzeuVar2.getClass());
/* 30 */                zzghVarZzb.zzg(zzeuVar2, bArr, 0, i2, new zzds(zzekVar));
/* 33 */                zzghVarZzb.zze(zzeuVar2);
/* 38 */                if (zzeuVar2.zza == 0) {
/* 40 */                    return zzeuVar2;
                        }
/* 46 */                throw new RuntimeException();
                    } catch (zzfa e) {
/* 96 */                e.zze(zzeuVar2);
/* 99 */                throw e;
                    } catch (zzgx e2) {
/* 88 */                zzfa zzfaVarZza = e2.zza();
/* 92 */                zzfaVarZza.zze(zzeuVar2);
/* 95 */                throw zzfaVarZza;
                    } catch (IOException e3) {
/* 70 */                if (e3.getCause() instanceof zzfa) {
/* 78 */                    throw ((zzfa) e3.getCause());
                        }
/* 81 */                zzfa zzfaVar = new zzfa(e3);
/* 84 */                zzfaVar.zze(zzeuVar2);
/* 87 */                throw zzfaVar;
                    } catch (IndexOutOfBoundsException unused) {
/* 56 */                zzfa zzfaVarZzf = zzfa.zzf();
/* 60 */                zzfaVarZzf.zze(zzeuVar2);
/* 63 */                throw zzfaVarZzf;
                    }
                }

                public final boolean equals(Object obj) {
/* 1 */             if (this == obj) {
/* 3 */                 return true;
                    }
/* 6 */             if (obj != null && getClass() == obj.getClass()) {
/* 34 */                return zzge.zza().zzb(getClass()).zzh(this, (zzeu) obj);
                    }
/* 5 */             return false;
                }

                public final int hashCode() {
/* 1 */             int i = this.zza;
/* 3 */             if (i != 0) {
/* 5 */                 return i;
                    }
/* 18 */            int iZza = zzge.zza().zzb(getClass()).zza(this);
/* 22 */            this.zza = iZza;
/* 24 */            return iZza;
                }

                public final String toString() {
/* 5 */             return zzfy.zza(this, super.toString());
                }

                @Override // com.google.android.gms.internal.auth.zzfw
                public final /* synthetic */ zzfv zzd() {
/* 7 */             zzes zzesVar = (zzes) zzi(5, null, null);
/* 9 */             zzesVar.zze(this);
/* 12 */            return zzesVar;
                }

                @Override // com.google.android.gms.internal.auth.zzfx
                public final /* synthetic */ zzfw zzh() {
/* 7 */             return (zzeu) zzi(6, null, null);
                }

                public abstract Object zzi(int i, Object obj, Object obj2);
            }
