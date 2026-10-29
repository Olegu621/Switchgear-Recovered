            package com.google.android.recaptcha.internal;

            import android.webkit.JavascriptInterface;
            import java.util.concurrent.TimeUnit;
            import kotlin.Unit;
            import p000.C1869kx;
            import p000.InterfaceC1809jx;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzld {
                final /* synthetic */ zzly zza;
                private Long zzb;
                private final zzmf zzc = zzmf.zzb();

                public zzld(zzly zzlyVar) {
/* 1 */             this.zza = zzlyVar;
                }

                private final void zzb() {
/* 3 */             if (this.zzb == null) {
/* 5 */                 zzmf zzmfVar = this.zzc;
/* 7 */                 zzmfVar.zzf();
/* 20 */                this.zzb = Long.valueOf(zzmfVar.zza(TimeUnit.MILLISECONDS));
                    }
                }

                public final Long zza() {
/* 1 */             return this.zzb;
                }

                @JavascriptInterface
                public final void zzlce(String str) throws zzsx {
/* 1 */             zzly zzlyVar = this.zza;
/* 7 */             Long l = zzlyVar.zzr().zzb;
/* 9 */             zzb();
/* 16 */            zzwn zzwnVarZzM = zzwn.zzM(zzdb.zza(str));
/* 20 */            zzzl zzzlVarZzi = zzzm.zzi();
/* 24 */            zzzlVarZzi.zzf(zzwnVarZzM);
/* 37 */            zzly.zzo(zzlyVar).zza((zzzm) zzzlVarZzi.zzk());
                }

                @JavascriptInterface
                public final void zzlsm(String str) {
/* 1 */             zzb();
/* 4 */             zzzl zzzlVarZzi = zzzm.zzi();
/* 16 */            zzzlVarZzi.zzq(zzxc.zzi(zzdb.zza(str)));
/* 31 */            zzly.zzo(this.zza).zza((zzzm) zzzlVarZzi.zzk());
                }

                @JavascriptInterface
                public final void zzoid(String str) throws zzsx {
/* 1 */             zzb();
/* 8 */             zzzh zzzhVarZzg = zzzh.zzg(zzdb.zza(str));
/* 16 */            zzzhVarZzg.zzi().name();
/* 25 */            if (zzzhVarZzg.zzi() != zzzk.JS_CODE_SUCCESS) {
/* 62 */                zzzhVarZzg.zzi().name();
/* 65 */                int i = zzcg.zza;
/* 71 */                zzcg zzcgVarZza = zzcf.zza(zzzhVarZzg.zzi());
/* 75 */                zzly zzlyVar = this.zza;
/* 81 */                zzlyVar.zzz().hashCode();
/* 90 */                ((C1869kx) zzlyVar.zzz()).m6289U(zzcgVarZza);
/* 93 */                return;
                    }
/* 27 */            zzly zzlyVar2 = this.zza;
/* 33 */            zzlyVar2.zzz().hashCode();
/* 48 */            if (((C1869kx) zzlyVar2.zzz()).m10238D(Unit.f12910a)) {
/* 57 */                return;
                    }
/* 54 */            zzlyVar2.zzz().hashCode();
                }

                @JavascriptInterface
                public final void zzrp(String str) {
/* 1 */             zzb();
/* 6 */             zzik zzikVar = this.zza.zzb;
/* 8 */             if (zzikVar == null) {
/* 10 */                zzikVar = null;
                    }
/* 11 */            zzikVar.zza(str);
                }

                @JavascriptInterface
                public final void zzscd(String str) throws zzsx {
/* 1 */             zzb();
/* 8 */             zzxx zzxxVarZzi = zzxx.zzi(zzdb.zza(str));
/* 12 */            zzxxVarZzi.toString();
/* 29 */            InterfaceC1809jx interfaceC1809jx = (InterfaceC1809jx) this.zza.zzd.remove(zzxxVarZzi.zzk());
/* 31 */            if (interfaceC1809jx != null) {
/* 35 */                ((C1869kx) interfaceC1809jx).m10238D(zzxxVarZzi);
                    }
                }
            }
