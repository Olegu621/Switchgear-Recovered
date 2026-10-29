            package com.google.android.recaptcha.internal;

            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public abstract class zzqv extends zzqe {
                public static final /* synthetic */ int zzb = 0;
                private static final Logger zzc = Logger.getLogger(zzqv.class.getName());
                private static final boolean zzd = zzvc.zzx();
                zzqw zza;

                public /* synthetic */ zzqv(zzqu zzquVar) {
                }

                public static int zzA(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public static int zzB(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                @Deprecated
                public static int zzw(int i, zzts zztsVar, zzug zzugVar) {
/* 3 */             int iZzA = zzA(i << 3);
/* 14 */            return ((zzpw) zztsVar).zza(zzugVar) + iZzA + iZzA;
                }

                public static int zzx(zzts zztsVar) {
/* 1 */             int iZzo = zztsVar.zzo();
/* 9 */             return zzA(iZzo) + iZzo;
                }

                public static int zzy(zzts zztsVar, zzug zzugVar) {
/* 3 */             int iZza = ((zzpw) zztsVar).zza(zzugVar);
/* 11 */            return zzA(iZza) + iZza;
                }

                public static int zzz(String str) {
                    int length;
                    try {
/* 1 */                 length = zzvf.zzc(str);
                    } catch (zzve unused) {
/* 12 */                length = str.getBytes(zzsv.zza).length;
                    }
/* 17 */            return zzA(length) + length;
                }

                public final void zzC() {
/* 5 */             if (zza() == 0) {
/* 7 */                 return;
                    }
/* 10 */            f42.m3656l("Did not write as much data as expected.");
                }

                public final void zzD(String str, zzve zzveVar) throws IOException {
/* 12 */            zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzveVar);
/* 17 */            byte[] bytes = str.getBytes(zzsv.zza);
                    try {
/* 21 */                int length = bytes.length;
/* 22 */                zzt(length);
/* 26 */                zzl(bytes, 0, length);
                    } catch (IndexOutOfBoundsException e) {
/* 37 */                throw new zzqt(e);
                    }
                }

                public abstract int zza();

                public abstract void zzb(byte b) throws IOException;

                public abstract void zzd(int i, boolean z) throws IOException;

                public abstract void zze(int i, zzqm zzqmVar) throws IOException;

                public abstract void zzf(int i, int i2) throws IOException;

                public abstract void zzg(int i) throws IOException;

                public abstract void zzh(int i, long j) throws IOException;

                public abstract void zzi(long j) throws IOException;

                public abstract void zzj(int i, int i2) throws IOException;

                public abstract void zzk(int i) throws IOException;

                public abstract void zzl(byte[] bArr, int i, int i2) throws IOException;

                public abstract void zzm(int i, zzts zztsVar, zzug zzugVar) throws IOException;

                public abstract void zzn(int i, zzts zztsVar) throws IOException;

                public abstract void zzo(int i, zzqm zzqmVar) throws IOException;

                public abstract void zzp(int i, String str) throws IOException;

                public abstract void zzr(int i, int i2) throws IOException;

                public abstract void zzs(int i, int i2) throws IOException;

                public abstract void zzt(int i) throws IOException;

                public abstract void zzu(int i, long j) throws IOException;

                public abstract void zzv(long j) throws IOException;

/* 4 */         private zzqv() {
/* 5 */             throw null;
                }
            }
