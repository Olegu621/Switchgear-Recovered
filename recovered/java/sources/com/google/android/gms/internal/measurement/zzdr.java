            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.content.res.Resources;
            import android.os.Bundle;
            import android.text.TextUtils;
            import com.google.android.gms.dynamic.ObjectWrapper;
            import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.Objects;
            import p000.kb1;
            import p000.wb0;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzdr extends zzeq {
                final /* synthetic */ Context zza;
                final /* synthetic */ Bundle zzb;
                final /* synthetic */ zzfb zzc;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zzdr(zzfb zzfbVar, Context context, Bundle bundle) {
/* 11 */            super(zzfbVar, true);
/* 1 */             this.zza = context;
/* 3 */             this.zzb = bundle;
/* 5 */             Objects.requireNonNull(zzfbVar);
/* 8 */             this.zzc = zzfbVar;
                }

                @Override // com.google.android.gms.internal.measurement.zzeq
                public final void zza() {
                    try {
/* 7 */                 Context context = this.zza;
/* 9 */                 kb1.m6061n(context);
/* 12 */                String strM10208O = yy1.m10208O(context);
/* 16 */                Resources resources = context.getResources();
/* 24 */                if (TextUtils.isEmpty(strM10208O)) {
/* 26 */                    strM10208O = yy1.m10208O(context);
                        }
/* 38 */                int identifier = resources.getIdentifier("google_analytics_force_disable_updates", "bool", strM10208O);
/* 42 */                Boolean boolValueOf = null;
/* 43 */                if (identifier != 0) {
                            try {
/* 50 */                        boolValueOf = Boolean.valueOf(resources.getBoolean(identifier));
                            } catch (Resources.NotFoundException unused) {
                            }
                        }
/* 54 */                zzfb zzfbVar = this.zzc;
/* 71 */                zzfbVar.zzR(zzfbVar.zzc(context, boolValueOf == null || !boolValueOf.booleanValue()));
/* 78 */                if (zzfbVar.zzQ() == null) {
/* 86 */                    AbstractC1245n0.m4889q(zzfbVar.zzO(), "Failed to connect to measurement client.");
/* 147 */                   return;
                        }
/* 90 */                int iM9512a = wb0.m9512a(context, ModuleDescriptor.MODULE_ID);
/* 94 */                int iM9514d = wb0.m9514d(context, ModuleDescriptor.MODULE_ID, false);
/* 127 */               zzdd zzddVar = new zzdd(130000L, Math.max(iM9512a, iM9514d), Boolean.TRUE.equals(boolValueOf) || iM9514d < iM9512a, this.zzb, yy1.m10208O(context));
/* 130 */               zzcr zzcrVarZzQ = zzfbVar.zzQ();
/* 134 */               kb1.m6061n(zzcrVarZzQ);
/* 144 */               zzcrVarZzQ.initialize(new ObjectWrapper(context), zzddVar, this.zzh);
                    } catch (Exception e) {
/* 150 */               this.zzc.zzN(e, true, false);
                    }
                }
            }
