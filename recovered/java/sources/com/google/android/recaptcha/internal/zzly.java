            package com.google.android.recaptcha.internal;

            import android.app.Application;
            import android.webkit.WebView;
            import java.util.LinkedHashMap;
            import java.util.Map;
            import kotlin.Unit;
            import kotlin.collections.CollectionsKt;
            import kotlin.jvm.internal.Intrinsics;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            import p000.c10;
            import p000.i13;
            import p000.lo2;
            import p000.p51;
            import p000.r51;
            import p000.z10;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzly extends zzg {
                public InterfaceC1809jx zza;
                public zzik zzb;
                private zzxn zze;
                private final p51 zzi;
                private final p51 zzj;
                private final p51 zzk;
                private final p51 zzl;
                private final p51 zzm;
                private final p51 zzn;
                private final p51 zzo;
                private final Map zzc = zzlz.zza();
                private final Map zzd = new LinkedHashMap();
                private final zzdj zzf = new zzdj(zzmc.zza);
                private final zzmf zzg = zzmf.zzc();
                private final zzld zzh = new zzld(this);

                public zzly() {
/* 39 */            int i = zzby.zza;
/* 47 */            this.zzi = r51.m8065b(zzlm.zza);
/* 55 */            this.zzj = r51.m8065b(zzln.zza);
/* 63 */            this.zzk = r51.m8065b(zzlo.zza);
/* 71 */            this.zzl = r51.m8065b(zzlp.zza);
/* 79 */            this.zzm = r51.m8065b(zzlq.zza);
/* 87 */            this.zzn = r51.m8065b(zzlr.zza);
/* 95 */            this.zzo = r51.m8065b(zzls.zza);
                }

                private final Application zzC() {
/* 7 */             return (Application) this.zzm.getValue();
                }

                /* JADX INFO: Access modifiers changed from: private */
                public final zzcr zzD() {
/* 7 */             return (zzcr) this.zzn.getValue();
                }

                public static final /* synthetic */ zzcy zzm(zzly zzlyVar) {
/* 7 */             return (zzcy) zzlyVar.zzj.getValue();
                }

                public static final /* synthetic */ zzgs zzo(zzly zzlyVar) {
/* 7 */             return (zzgs) zzlyVar.zzo.getValue();
                }

                public static final /* synthetic */ zzib zzp(zzly zzlyVar) {
/* 7 */             return (zzib) zzlyVar.zzl.getValue();
                }

                public static final /* synthetic */ zzig zzq(zzly zzlyVar) {
/* 7 */             return (zzig) zzlyVar.zzk.getValue();
                }

                public static final /* synthetic */ Object zzu(zzly zzlyVar, c10 c10Var) {
/* 9 */             return new zzhg(new zzlu(zzlyVar, null));
                }

                public final zzip zzB(zzxn zzxnVar, zzdo zzdoVar, WebView webView) {
/* 11 */            zzis zzisVar = new zzis(webView, zzD().zzb());
/* 16 */            zzku zzkuVar = new zzku();
/* 27 */            zzkuVar.zzb(CollectionsKt.m6193L(zzxnVar.zzQ()));
/* 37 */            zzjb zzjbVar = new zzjb(zzisVar, zzdoVar, new zzct());
/* 47 */            zzkv zzkvVar = new zzkv(zzkuVar, new zzks());
/* 55 */            zzjbVar.zze(3, zzC());
/* 78 */            zzjbVar.zze(5, zzlb.class.getMethod("cs", new Object[0].getClass()));
/* 91 */            zzjbVar.zze(6, new zzkw(zzC()));
/* 100 */           zzjbVar.zze(7, new zzky());
/* 114 */           zzjbVar.zze(8, new zzlc(zzC()));
/* 128 */           zzjbVar.zze(9, new zzkz(zzC()));
/* 142 */           zzjbVar.zze(10, new zzkx(zzC()));
/* 159 */           return new zzip(zzD().zzd(), zzjbVar, zzkvVar, zzij.zza());
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zza(String str, c10 c10Var) {
/* 1 */             zzxw zzxwVarZzf = zzxx.zzf();
/* 5 */             zzxwVarZzf.zze(str);
/* 8 */             return zzxwVarZzf.zzk();
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzb(String str, c10 c10Var) {
/* 9 */             return new zzhg(new zzlk(this, str, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzc(zzcg zzcgVar, c10 c10Var) {
/* 7 */             Intrinsics.m6216a(zzcgVar.zza(), zzcd.zzb);
/* 10 */            return Unit.f12910a;
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzd(zzxn zzxnVar, c10 c10Var) {
/* 9 */             return new zzhg(new zzll(zzxnVar, this, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zze(String str, long j, Exception exc, c10 c10Var) {
/* 1 */             exc.getMessage();
/* 10 */            InterfaceC1809jx interfaceC1809jx = (InterfaceC1809jx) this.zzd.remove(str);
/* 12 */            if (interfaceC1809jx != null) {
/* 16 */                ((C1869kx) interfaceC1809jx).m6289U(exc);
                    }
/* 19 */            return Unit.f12910a;
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final Object zzf(Exception exc, c10 c10Var) {
                    return ((exc instanceof lo2) && this.zzh.zza() == null) ? new zzcg(zzce.zzc, zzcd.zzH, null, null, 12, null) : zzh.zza(exc, new zzcg(zzce.zzb, zzcd.zzV, exc.getMessage(), null, 8, null));
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final int zzj() {
/* 1 */             return 33;
                }

                @Override // com.google.android.recaptcha.internal.zzg
                public final int zzk() {
/* 1 */             return 32;
                }

                public final zzdj zzn() {
/* 1 */             return this.zzf;
                }

                public final zzld zzr() {
/* 1 */             return this.zzh;
                }

                public final Object zzv(c10 c10Var) {
/* 31 */            return i13.m4422D(zzD().zzb().mo4406c(), new zzma((zzmb) this.zzi.getValue(), zzC(), null), c10Var);
                }

                public final Object zzw(c10 c10Var) throws Throwable {
/* 19 */            Object objM4422D = i13.m4422D(zzD().zzb().mo4406c(), new zzlf(this, null), c10Var);
                    return objM4422D == z10.f19902a ? objM4422D : Unit.f12910a;
                }

                public final InterfaceC1809jx zzz() {
/* 1 */             InterfaceC1809jx interfaceC1809jx = this.zza;
/* 3 */             if (interfaceC1809jx != null) {
/* 5 */                 return interfaceC1809jx;
                    }
/* 6 */             return null;
                }
            }
