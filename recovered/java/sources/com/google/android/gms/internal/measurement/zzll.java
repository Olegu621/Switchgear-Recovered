            package com.google.android.gms.internal.measurement;

            import java.io.IOException;
            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 3 */     public abstract class zzll extends zzky {
                public static final /* synthetic */ int zzb = 0;
                private static final Logger zzc = Logger.getLogger(zzll.class.getName());
                private static final boolean zzd = zzoo.zza();
                zzlm zza;

                public /* synthetic */ zzll(byte[] bArr) {
                }

                public static int zzA(long j) {
/* 9 */             return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
                }

                public static int zzB(String str) {
                    int length;
                    try {
/* 1 */                 length = zzor.zzb(str);
                    } catch (zzoq unused) {
/* 12 */                length = str.getBytes(zzmo.zza).length;
                    }
/* 17 */            return zzz(length) + length;
                }

                public static int zzC(zznl zznlVar) {
/* 1 */             int iZzcn = zznlVar.zzcn();
/* 9 */             return zzz(iZzcn) + iZzcn;
                }

                public static int zzD(zznl zznlVar, zznw zznwVar) {
/* 3 */             int iZzcd = ((zzkr) zznlVar).zzcd(zznwVar);
/* 11 */            return zzz(iZzcd) + iZzcd;
                }

                @Deprecated
                public static int zzG(int i, zznl zznlVar, zznw zznwVar) {
/* 3 */             int iZzz = zzz(i << 3);
/* 14 */            return ((zzkr) zznlVar).zzcd(zznwVar) + iZzz + iZzz;
                }

                public static int zzz(int i) {
/* 9 */             return (352 - (Integer.numberOfLeadingZeros(i) * 9)) >>> 6;
                }

                public final void zzE() {
/* 5 */             if (zzy() == 0) {
/* 7 */                 return;
                    }
/* 10 */            f42.m3656l("Did not write as much data as expected.");
                }

                public final void zzF(String str, zzoq zzoqVar) throws IOException {
/* 12 */            zzc.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) zzoqVar);
/* 17 */            byte[] bytes = str.getBytes(zzmo.zza);
                    try {
/* 21 */                int length = bytes.length;
/* 22 */                zzr(length);
/* 26 */                zzw(bytes, 0, length);
                    } catch (IndexOutOfBoundsException e) {
/* 37 */                throw new zzlk(e);
                    }
                }

                public abstract void zza(int i, int i2) throws IOException;

                public abstract void zzb(int i, int i2) throws IOException;

                public abstract void zzc(int i, int i2) throws IOException;

                public abstract void zzd(int i, int i2) throws IOException;

                public abstract void zze(int i, long j) throws IOException;

                public abstract void zzf(int i, long j) throws IOException;

                public abstract void zzg(int i, boolean z) throws IOException;

                public abstract void zzh(int i, String str) throws IOException;

                public abstract void zzi(int i, zzlg zzlgVar) throws IOException;

                public abstract void zzj(zzlg zzlgVar) throws IOException;

                public abstract void zzk(byte[] bArr, int i, int i2) throws IOException;

                public abstract void zzl(int i, zznl zznlVar, zznw zznwVar) throws IOException;

                public abstract void zzm(int i, zznl zznlVar) throws IOException;

                public abstract void zzn(int i, zzlg zzlgVar) throws IOException;

                public abstract void zzo(zznl zznlVar) throws IOException;

                public abstract void zzp(byte b) throws IOException;

                public abstract void zzq(int i) throws IOException;

                public abstract void zzr(int i) throws IOException;

                public abstract void zzs(int i) throws IOException;

                public abstract void zzt(long j) throws IOException;

                public abstract void zzu(long j) throws IOException;

                public abstract void zzw(byte[] bArr, int i, int i2) throws IOException;

                public abstract void zzx(String str) throws IOException;

                public abstract int zzy();

/* 4 */         private zzll() {
/* 5 */             throw null;
                }
            }
