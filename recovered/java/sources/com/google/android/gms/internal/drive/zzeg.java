            package com.google.android.gms.internal.drive;

            import android.content.Context;
            import android.os.Looper;
            import android.os.Message;
            import android.util.Log;
            import android.util.Pair;
            import com.google.android.gms.common.data.DataHolder;
            import com.google.android.gms.drive.events.ChangeEvent;
            import com.google.android.gms.drive.events.CompletionEvent;
            import com.google.android.gms.drive.events.DriveEvent;
            import com.google.android.gms.drive.events.DriveEventService;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import p000.InterfaceC2192ss;
            import p000.ej3;
            import p000.gi1;
            import p000.mr0;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzeg extends zzir {
                private final Context zzgw;

                private zzeg(Looper looper, Context context) {
/* 1 */             super(looper);
/* 4 */             this.zzgw = context;
                }

                @Override // android.os.Handler
                public final void handleMessage(Message message) {
/* 4 */             if (message.what != 1) {
/* 1 */                 mr0 mr0Var = zzee.zzbz;
/* 12 */                Object[] objArr = {this.zzgw};
/* 23 */                if (Log.isLoggable(mr0Var.f13983a, 6)) {
/* 25 */                    String str = mr0Var.f13984b;
/* 29 */                    String strConcat = String.format("Don't know how to handle this event in context %s", objArr);
/* 33 */                    if (str != null) {
/* 36 */                        strConcat = str.concat(strConcat);
                            }
/* 42 */                    AbstractC1245n0.m4876d("EventCallback", strConcat);
/* 45 */                    return;
                        }
/* 139 */               return;
                    }
/* 48 */            Pair pair = (Pair) message.obj;
/* 52 */            ej3 ej3Var = (ej3) pair.first;
/* 56 */            DriveEvent driveEvent = (DriveEvent) pair.second;
/* 58 */            int type = driveEvent.getType();
/* 62 */            if (type == 1) {
/* 179 */               ((InterfaceC2192ss) ej3Var).onChange((ChangeEvent) driveEvent);
/* 182 */               return;
                    }
/* 66 */            if (type == 2) {
/* 160 */               ((DriveEventService) ej3Var).getClass();
/* 171 */               DriveEventService.f3661e.m6795b("Unhandled completion event in %s: %s", null, (CompletionEvent) driveEvent);
/* 174 */               return;
                    }
/* 69 */            if (type != 3) {
/* 72 */                if (type == 4) {
/* 112 */                   ((DriveEventService) ej3Var).getClass();
/* 123 */                   DriveEventService.f3661e.m6795b("Unhandled changes available event in %s: %s", null, (com.google.android.gms.drive.events.zzb) driveEvent);
/* 126 */                   return;
                        } else {
/* 76 */                    if (type != 8) {
/* 88 */                        zzee.zzbz.m6795b("Unexpected event: %s", driveEvent);
/* 91 */                        return;
                            }
/* 98 */                    new zze(((com.google.android.gms.drive.events.zzr) driveEvent).f3673a);
/* 101 */                   ej3Var.getClass();
/* 104 */                   C1697u2.m5431g();
/* 107 */                   return;
                        }
                    }
/* 127 */           if (ej3Var != null) {
/* 152 */               C1697u2.m5431g();
/* 155 */               return;
                    }
/* 129 */           com.google.android.gms.drive.events.zzo zzoVar = (com.google.android.gms.drive.events.zzo) driveEvent;
/* 131 */           DataHolder dataHolder = zzoVar.f3670a;
/* 133 */           if (dataHolder != null) {
/* 148 */               new zzeh(new gi1(dataHolder));
/* 151 */               throw null;
                    }
/* 137 */           if (zzoVar.f3671b) {
/* 140 */               throw null;
                    }
                }
            }
