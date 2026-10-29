            package com.google.android.gms.internal.measurement;

            import androidx.core.app.NotificationCompat;
            import java.util.List;
            import okhttp3.HttpUrl;
            import okhttp3.internal.http2.Http2;
            import okhttp3.internal.http2.Http2Connection;
            import okio.Segment;
            import p000.AbstractC0208c9;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzid extends zzme implements zznm {
                private static final zzid zzat;
                private int zzA;
                private boolean zzD;
                private int zzG;
                private int zzH;
                private int zzI;
                private long zzK;
                private long zzL;
                private int zzO;
                private zzig zzQ;
                private long zzS;
                private long zzT;
                private int zzW;
                private boolean zzX;
                private boolean zzZ;
                private zzhy zzaa;
                private long zzae;
                private boolean zzaf;
                private boolean zzah;
                private int zzaj;
                private zzhe zzal;
                private int zzam;
                private zzha zzan;
                private zzis zzap;
                private long zzaq;
                private zzho zzas;
                private int zzb;
                private int zzd;
                private int zze;
                private long zzh;
                private long zzi;
                private long zzj;
                private long zzk;
                private long zzl;
                private int zzq;
                private long zzu;
                private long zzv;
                private boolean zzx;
                private long zzz;
                private zzmn zzf = zzme.zzcv();
                private zzmn zzg = zzme.zzcv();
                private String zzm = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzn = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzo = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzp = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzr = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzs = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzt = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzw = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzy = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzB = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzC = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzE = zzme.zzcv();
                private String zzF = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzJ = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzM = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzN = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzP = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzml zzR = zzme.zzcs();
                private String zzU = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzV = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzY = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzab = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzmn zzac = zzme.zzcv();
                private String zzad = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzag = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzai = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzak = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzao = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzar = HttpUrl.FRAGMENT_ENCODE_SET;

                static {
/* 3 */             zzid zzidVar = new zzid();
/* 6 */             zzat = zzidVar;
/* 10 */            zzme.zzcp(zzid.class, zzidVar);
                }

                private zzid() {
                }

                public static zzic zzaE() {
/* 7 */             return (zzic) zzat.zzck();
                }

                public static zzic zzaF(zzid zzidVar) {
/* 3 */             zzma zzmaVarZzck = zzat.zzck();
/* 7 */             zzmaVarZzck.zzbd(zzidVar);
/* 10 */            return (zzic) zzmaVarZzck;
                }

                private final void zzcy() {
/* 1 */             zzmn zzmnVar = this.zzf;
/* 7 */             if (zzmnVar.zza()) {
/* 15 */                return;
                    }
/* 13 */            this.zzf = zzme.zzcw(zzmnVar);
                }

                private final void zzcz() {
/* 1 */             zzmn zzmnVar = this.zzg;
/* 7 */             if (zzmnVar.zza()) {
/* 15 */                return;
                    }
/* 13 */            this.zzg = zzme.zzcw(zzmnVar);
                }

                public final String zzA() {
/* 1 */             return this.zzs;
                }

                public final String zzB() {
/* 1 */             return this.zzt;
                }

                public final boolean zzC() {
                    return (this.zzb & Http2.INITIAL_MAX_FRAME_SIZE) != 0;
                }

                public final long zzD() {
/* 1 */             return this.zzu;
                }

                public final boolean zzE() {
                    return (this.zzb & 32768) != 0;
                }

                public final long zzF() {
/* 1 */             return this.zzv;
                }

                public final String zzG() {
/* 1 */             return this.zzw;
                }

                public final boolean zzH() {
                    return (this.zzb & 131072) != 0;
                }

                public final boolean zzI() {
/* 1 */             return this.zzx;
                }

                public final String zzJ() {
/* 1 */             return this.zzy;
                }

                public final boolean zzK() {
                    return (this.zzb & 524288) != 0;
                }

                public final long zzL() {
/* 1 */             return this.zzz;
                }

                public final boolean zzM() {
                    return (this.zzb & 1048576) != 0;
                }

                public final int zzN() {
/* 1 */             return this.zzA;
                }

                public final String zzO() {
/* 1 */             return this.zzB;
                }

                public final String zzP() {
/* 1 */             return this.zzC;
                }

                public final boolean zzQ() {
                    return (this.zzb & 8388608) != 0;
                }

                public final boolean zzR() {
/* 1 */             return this.zzD;
                }

                public final List zzS() {
/* 1 */             return this.zzE;
                }

                public final String zzT() {
/* 1 */             return this.zzF;
                }

                public final boolean zzU() {
                    return (this.zzb & 33554432) != 0;
                }

                public final int zzV() {
/* 1 */             return this.zzG;
                }

                public final boolean zzW() {
                    return (this.zzb & 536870912) != 0;
                }

                public final long zzX() {
/* 1 */             return this.zzK;
                }

                public final boolean zzY() {
                    return (this.zzb & Integer.MIN_VALUE) != 0;
                }

                public final String zzZ() {
/* 1 */             return this.zzM;
                }

                public final boolean zza() {
                    return (this.zzb & 1) != 0;
                }

                public final boolean zzaA() {
                    return (this.zzd & 134217728) != 0;
                }

                public final long zzaB() {
/* 1 */             return this.zzaq;
                }

                public final boolean zzaC() {
                    return (this.zzd & 536870912) != 0;
                }

                public final zzho zzaD() {
/* 1 */             zzho zzhoVar = this.zzas;
                    return zzhoVar == null ? zzho.zzc() : zzhoVar;
                }

                public final /* synthetic */ void zzaG(int i) {
/* 5 */             this.zzb |= 1;
/* 7 */             this.zze = 1;
                }

                public final /* synthetic */ void zzaH(int i, zzhs zzhsVar) {
/* 1 */             zzhsVar.getClass();
/* 4 */             zzcy();
/* 9 */             this.zzf.set(i, zzhsVar);
                }

                public final /* synthetic */ void zzaI(zzhs zzhsVar) {
/* 1 */             zzhsVar.getClass();
/* 4 */             zzcy();
/* 9 */             this.zzf.add(zzhsVar);
                }

                public final /* synthetic */ void zzaJ(Iterable iterable) {
/* 1 */             zzcy();
/* 6 */             zzkr.zzce(iterable, this.zzf);
                }

                public final /* synthetic */ void zzaK() {
/* 5 */             this.zzf = zzme.zzcv();
                }

                public final /* synthetic */ void zzaL(int i) {
/* 1 */             zzcy();
/* 6 */             this.zzf.remove(i);
                }

                public final /* synthetic */ void zzaM(int i, zziu zziuVar) {
/* 1 */             zziuVar.getClass();
/* 4 */             zzcz();
/* 9 */             this.zzg.set(i, zziuVar);
                }

                public final /* synthetic */ void zzaN(zziu zziuVar) {
/* 1 */             zziuVar.getClass();
/* 4 */             zzcz();
/* 9 */             this.zzg.add(zziuVar);
                }

                public final /* synthetic */ void zzaO(Iterable iterable) {
/* 1 */             zzcz();
/* 6 */             zzkr.zzce(iterable, this.zzg);
                }

                public final /* synthetic */ void zzaP(int i) {
/* 1 */             zzcz();
/* 6 */             this.zzg.remove(i);
                }

                public final /* synthetic */ void zzaQ(long j) {
/* 5 */             this.zzb |= 2;
/* 7 */             this.zzh = j;
                }

                public final /* synthetic */ void zzaR() {
/* 5 */             this.zzb &= -3;
/* 9 */             this.zzh = 0L;
                }

                public final /* synthetic */ void zzaS(long j) {
/* 5 */             this.zzb |= 4;
/* 7 */             this.zzi = j;
                }

                public final /* synthetic */ void zzaT(long j) {
/* 5 */             this.zzb |= 8;
/* 7 */             this.zzj = j;
                }

                public final /* synthetic */ void zzaU(long j) {
/* 5 */             this.zzb |= 16;
/* 7 */             this.zzk = j;
                }

                public final /* synthetic */ void zzaV() {
/* 5 */             this.zzb &= -17;
/* 9 */             this.zzk = 0L;
                }

                public final /* synthetic */ void zzaW(long j) {
/* 5 */             this.zzb |= 32;
/* 7 */             this.zzl = j;
                }

                public final /* synthetic */ void zzaX() {
/* 5 */             this.zzb &= -33;
/* 9 */             this.zzl = 0L;
                }

                public final /* synthetic */ void zzaY(String str) {
/* 5 */             this.zzb |= 64;
/* 9 */             this.zzm = "android";
                }

                public final /* synthetic */ void zzaZ(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 128;
/* 10 */            this.zzn = str;
                }

                public final boolean zzaa() {
                    return (this.zzd & 2) != 0;
                }

                public final int zzab() {
/* 1 */             return this.zzO;
                }

                public final boolean zzac() {
                    return (this.zzd & 16) != 0;
                }

                public final long zzad() {
/* 1 */             return this.zzS;
                }

                public final boolean zzae() {
                    return (this.zzd & 128) != 0;
                }

                public final String zzaf() {
/* 1 */             return this.zzV;
                }

                public final boolean zzag() {
                    return (this.zzd & Segment.SIZE) != 0;
                }

                public final String zzah() {
/* 1 */             return this.zzab;
                }

                public final boolean zzai() {
                    return (this.zzd & 32768) != 0;
                }

                public final long zzaj() {
/* 1 */             return this.zzae;
                }

                public final boolean zzak() {
/* 1 */             return this.zzaf;
                }

                public final boolean zzal() {
                    return (this.zzd & 131072) != 0;
                }

                public final String zzam() {
/* 1 */             return this.zzag;
                }

                public final boolean zzan() {
                    return (this.zzd & 262144) != 0;
                }

                public final boolean zzao() {
/* 1 */             return this.zzah;
                }

                public final boolean zzap() {
                    return (this.zzd & 524288) != 0;
                }

                public final String zzaq() {
/* 1 */             return this.zzai;
                }

                public final int zzar() {
/* 1 */             return this.zzaj;
                }

                public final boolean zzas() {
                    return (this.zzd & 4194304) != 0;
                }

                public final zzhe zzat() {
/* 1 */             zzhe zzheVar = this.zzal;
                    return zzheVar == null ? zzhe.zzi() : zzheVar;
                }

                public final boolean zzau() {
                    return (this.zzd & 8388608) != 0;
                }

                public final int zzav() {
/* 1 */             return this.zzam;
                }

                public final boolean zzaw() {
                    return (this.zzd & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0;
                }

                public final zzha zzax() {
/* 1 */             zzha zzhaVar = this.zzan;
                    return zzhaVar == null ? zzha.zzs() : zzhaVar;
                }

                public final boolean zzay() {
                    return (this.zzd & 67108864) != 0;
                }

                public final zzis zzaz() {
/* 1 */             zzis zzisVar = this.zzap;
                    return zzisVar == null ? zzis.zzc() : zzisVar;
                }

                public final int zzb() {
/* 1 */             return this.zze;
                }

                public final /* synthetic */ void zzbA(long j) {
/* 6 */             this.zzb |= 536870912;
/* 8 */             this.zzK = j;
                }

                public final /* synthetic */ void zzbB(String str) {
/* 1 */             str.getClass();
/* 9 */             this.zzb |= Integer.MIN_VALUE;
/* 11 */            this.zzM = str;
                }

                public final /* synthetic */ void zzbC() {
/* 7 */             this.zzb &= AbstractC0208c9.API_PRIORITY_OTHER;
/* 13 */            this.zzM = zzat.zzM;
                }

                public final /* synthetic */ void zzbD(int i) {
/* 5 */             this.zzd |= 2;
/* 7 */             this.zzO = i;
                }

                public final /* synthetic */ void zzbE(zzig zzigVar) {
/* 1 */             zzigVar.getClass();
/* 4 */             this.zzQ = zzigVar;
/* 10 */            this.zzd |= 8;
                }

                public final /* synthetic */ void zzbF(Iterable iterable) {
/* 1 */             zzml zzmlVar = this.zzR;
/* 7 */             if (!zzmlVar.zza()) {
/* 9 */                 int size = zzmlVar.size();
/* 18 */                this.zzR = zzmlVar.zzg(size + size);
                    }
/* 22 */            zzkr.zzce(iterable, this.zzR);
                }

                public final /* synthetic */ void zzbG(long j) {
/* 5 */             this.zzd |= 16;
/* 7 */             this.zzS = j;
                }

                public final /* synthetic */ void zzbH(long j) {
/* 5 */             this.zzd |= 32;
/* 7 */             this.zzT = j;
                }

                public final /* synthetic */ void zzbI(String str) {
/* 5 */             this.zzd |= 128;
/* 7 */             this.zzV = str;
                }

                public final /* synthetic */ void zzbJ(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzd |= Segment.SIZE;
/* 10 */            this.zzab = str;
                }

                public final /* synthetic */ void zzbK() {
/* 5 */             this.zzd &= -8193;
/* 11 */            this.zzab = zzat.zzab;
                }

                public final /* synthetic */ void zzbL(Iterable iterable) {
/* 1 */             zzmn zzmnVar = this.zzac;
/* 7 */             if (!zzmnVar.zza()) {
/* 13 */                this.zzac = zzme.zzcw(zzmnVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zzac);
                }

                public final /* synthetic */ void zzbM(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzd |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 10 */            this.zzad = str;
                }

                public final /* synthetic */ void zzbN(long j) {
/* 7 */             this.zzd |= 32768;
/* 9 */             this.zzae = j;
                }

                public final /* synthetic */ void zzbO(boolean z) {
/* 6 */             this.zzd |= 65536;
/* 8 */             this.zzaf = z;
                }

                public final /* synthetic */ void zzbP(String str) {
/* 6 */             this.zzd |= 131072;
/* 8 */             this.zzag = str;
                }

                public final /* synthetic */ void zzbQ(boolean z) {
/* 6 */             this.zzd |= 262144;
/* 8 */             this.zzah = z;
                }

                public final /* synthetic */ void zzbR(String str) {
/* 1 */             str.getClass();
/* 9 */             this.zzd |= 524288;
/* 11 */            this.zzai = str;
                }

                public final /* synthetic */ void zzbS(int i) {
/* 6 */             this.zzd |= 1048576;
/* 8 */             this.zzaj = i;
                }

                public final /* synthetic */ void zzbT(zzhe zzheVar) {
/* 1 */             zzheVar.getClass();
/* 4 */             this.zzal = zzheVar;
/* 11 */            this.zzd |= 4194304;
                }

                public final /* synthetic */ void zzbU(int i) {
/* 6 */             this.zzd |= 8388608;
/* 8 */             this.zzam = i;
                }

                public final /* synthetic */ void zzbV(zzha zzhaVar) {
/* 1 */             zzhaVar.getClass();
/* 4 */             this.zzan = zzhaVar;
/* 11 */            this.zzd |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
                }

                public final /* synthetic */ void zzbW(zzis zzisVar) {
/* 1 */             this.zzap = zzisVar;
/* 8 */             this.zzd |= 67108864;
                }

                public final /* synthetic */ void zzbX(long j) {
/* 6 */             this.zzd |= 134217728;
/* 8 */             this.zzaq = j;
                }

                public final /* synthetic */ void zzbY(String str) {
/* 6 */             this.zzd |= 268435456;
/* 10 */            this.zzar = HttpUrl.FRAGMENT_ENCODE_SET;
                }

                public final /* synthetic */ void zzbZ(zzho zzhoVar) {
/* 1 */             zzhoVar.getClass();
/* 4 */             this.zzas = zzhoVar;
/* 11 */            this.zzd |= 536870912;
                }

                public final /* synthetic */ void zzba(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= NotificationCompat.FLAG_LOCAL_ONLY;
/* 10 */            this.zzo = str;
                }

                public final /* synthetic */ void zzbb() {
/* 5 */             this.zzb &= -257;
/* 11 */            this.zzo = zzat.zzo;
                }

                public final /* synthetic */ void zzbc(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= NotificationCompat.FLAG_GROUP_SUMMARY;
/* 10 */            this.zzp = str;
                }

                public final /* synthetic */ void zzbd(int i) {
/* 5 */             this.zzb |= Segment.SHARE_MINIMUM;
/* 7 */             this.zzq = i;
                }

                public final /* synthetic */ void zzbe(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 2048;
/* 10 */            this.zzr = str;
                }

                public final /* synthetic */ void zzbf(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= 4096;
/* 10 */            this.zzs = str;
                }

                public final /* synthetic */ void zzbg(String str) {
/* 1 */             str.getClass();
/* 8 */             this.zzb |= Segment.SIZE;
/* 10 */            this.zzt = str;
                }

                public final /* synthetic */ void zzbh(long j) {
/* 5 */             this.zzb |= Http2.INITIAL_MAX_FRAME_SIZE;
/* 7 */             this.zzu = j;
                }

                public final /* synthetic */ void zzbi(long j) {
/* 7 */             this.zzb |= 32768;
/* 12 */            this.zzv = 130000L;
                }

                public final /* synthetic */ void zzbj(String str) {
/* 1 */             str.getClass();
/* 9 */             this.zzb |= 65536;
/* 11 */            this.zzw = str;
                }

                public final /* synthetic */ void zzbk() {
/* 7 */             this.zzb &= -65537;
/* 13 */            this.zzw = zzat.zzw;
                }

                public final /* synthetic */ void zzbl(boolean z) {
/* 6 */             this.zzb |= 131072;
/* 8 */             this.zzx = z;
                }

                public final /* synthetic */ void zzbm() {
/* 7 */             this.zzb &= -131073;
/* 10 */            this.zzx = false;
                }

                public final /* synthetic */ void zzbn(String str) {
/* 1 */             str.getClass();
/* 9 */             this.zzb |= 262144;
/* 11 */            this.zzy = str;
                }

                public final /* synthetic */ void zzbo() {
/* 7 */             this.zzb &= -262145;
/* 13 */            this.zzy = zzat.zzy;
                }

                public final /* synthetic */ void zzbp(long j) {
/* 6 */             this.zzb |= 524288;
/* 8 */             this.zzz = j;
                }

                public final /* synthetic */ void zzbq(int i) {
/* 6 */             this.zzb |= 1048576;
/* 8 */             this.zzA = i;
                }

                public final /* synthetic */ void zzbr(String str) {
/* 6 */             this.zzb |= 2097152;
/* 8 */             this.zzB = str;
                }

                public final /* synthetic */ void zzbs() {
/* 7 */             this.zzb &= -2097153;
/* 13 */            this.zzB = zzat.zzB;
                }

                public final /* synthetic */ void zzbt(String str) {
/* 1 */             str.getClass();
/* 9 */             this.zzb |= 4194304;
/* 11 */            this.zzC = str;
                }

                public final /* synthetic */ void zzbu(boolean z) {
/* 6 */             this.zzb |= 8388608;
/* 8 */             this.zzD = z;
                }

                public final /* synthetic */ void zzbv(Iterable iterable) {
/* 1 */             zzmn zzmnVar = this.zzE;
/* 7 */             if (!zzmnVar.zza()) {
/* 13 */                this.zzE = zzme.zzcw(zzmnVar);
                    }
/* 17 */            zzkr.zzce(iterable, this.zzE);
                }

                public final /* synthetic */ void zzbw() {
/* 5 */             this.zzE = zzme.zzcv();
                }

                public final /* synthetic */ void zzbx(String str) {
/* 1 */             str.getClass();
/* 9 */             this.zzb |= Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE;
/* 11 */            this.zzF = str;
                }

                public final /* synthetic */ void zzby(int i) {
/* 6 */             this.zzb |= 33554432;
/* 8 */             this.zzG = i;
                }

                public final /* synthetic */ void zzbz() {
/* 7 */             this.zzb &= -268435457;
/* 13 */            this.zzJ = zzat.zzJ;
                }

                public final List zzc() {
/* 1 */             return this.zzf;
                }

                public final int zzd() {
/* 3 */             return this.zzf.size();
                }

                public final zzhs zze(int i) {
/* 7 */             return (zzhs) this.zzf.get(i);
                }

                public final List zzf() {
/* 1 */             return this.zzg;
                }

                public final int zzg() {
/* 3 */             return this.zzg.size();
                }

                public final zziu zzh(int i) {
/* 7 */             return (zziu) this.zzg.get(i);
                }

                public final boolean zzi() {
                    return (this.zzb & 2) != 0;
                }

                public final long zzj() {
/* 1 */             return this.zzh;
                }

                public final boolean zzk() {
                    return (this.zzb & 4) != 0;
                }

                @Override // com.google.android.gms.internal.measurement.zzme
                public final Object zzl(int i, Object obj, Object obj2) {
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 194 */               return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 188 */               return zzme.zzcq(zzat, "\u0004C\u0000\u0002\u0001VC\u0000\u0005\u0000\u0001င\u0000\u0002\u001b\u0003\u001b\u0004ဂ\u0001\u0005ဂ\u0002\u0006ဂ\u0003\u0007ဂ\u0005\bဈ\u0006\tဈ\u0007\nဈ\b\u000bဈ\t\fင\n\rဈ\u000b\u000eဈ\f\u0010ဈ\r\u0011ဂ\u000e\u0012ဂ\u000f\u0013ဈ\u0010\u0014ဇ\u0011\u0015ဈ\u0012\u0016ဂ\u0013\u0017င\u0014\u0018ဈ\u0015\u0019ဈ\u0016\u001aဂ\u0004\u001cဇ\u0017\u001d\u001b\u001eဈ\u0018\u001fင\u0019 င\u001a!င\u001b\"ဈ\u001c#ဂ\u001d$ဂ\u001e%ဈ\u001f&ဈ 'င!)ဈ\",ဉ#-\u001d.ဂ$/ဂ%2ဈ&4ဈ'5᠌(7ဇ)9ဈ*:ဇ+;ဉ,?ဈ-@\u001aAဈ.Cဂ/Dဇ0Gဈ1Hဇ2Iဈ3Jင4Kဈ5Lဉ6Mင7Oဉ8Pဈ9Qဉ:Rဂ;Sဈ<Vဉ=", new Object[]{"zzb", "zzd", "zze", "zzf", zzhs.class, "zzg", zziu.class, "zzh", "zzi", "zzj", "zzl", "zzm", "zzn", "zzo", "zzp", "zzq", "zzr", "zzs", "zzt", "zzu", "zzv", "zzw", "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzk", "zzD", "zzE", zzhg.class, "zzF", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzL", "zzM", "zzN", "zzO", "zzP", "zzQ", "zzR", "zzS", "zzT", "zzU", "zzV", "zzW", zzgw.zza, "zzX", "zzY", "zzZ", "zzaa", "zzab", "zzac", "zzad", "zzae", "zzaf", "zzag", "zzah", "zzai", "zzaj", "zzak", "zzal", "zzam", "zzan", "zzao", "zzap", "zzaq", "zzar", "zzas"});
                    }
/* 9 */             if (i2 == 3) {
/* 30 */                return new zzid();
                    }
/* 12 */            byte[] bArr = null;
/* 13 */            if (i2 == 4) {
/* 24 */                return new zzic(bArr);
                    }
/* 16 */            if (i2 == 5) {
/* 18 */                return zzat;
                    }
/* 21 */            throw null;
                }

                public final long zzm() {
/* 1 */             return this.zzi;
                }

                public final boolean zzn() {
                    return (this.zzb & 8) != 0;
                }

                public final long zzo() {
/* 1 */             return this.zzj;
                }

                public final boolean zzp() {
                    return (this.zzb & 16) != 0;
                }

                public final long zzq() {
/* 1 */             return this.zzk;
                }

                public final boolean zzr() {
                    return (this.zzb & 32) != 0;
                }

                public final long zzs() {
/* 1 */             return this.zzl;
                }

                public final String zzt() {
/* 1 */             return this.zzm;
                }

                public final String zzu() {
/* 1 */             return this.zzn;
                }

                public final String zzv() {
/* 1 */             return this.zzo;
                }

                public final String zzw() {
/* 1 */             return this.zzp;
                }

                public final boolean zzx() {
                    return (this.zzb & Segment.SHARE_MINIMUM) != 0;
                }

                public final int zzy() {
/* 1 */             return this.zzq;
                }

                public final String zzz() {
/* 1 */             return this.zzr;
                }
            }
