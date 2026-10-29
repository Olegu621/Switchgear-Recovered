            package com.google.android.gms.common.internal;

            import android.content.ComponentName;
            import android.content.ServiceConnection;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.IInterface;
            
            /* JADX INFO: renamed from: com.google.android.gms.common.internal.d */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class ServiceConnectionC0325d implements ServiceConnection {

                /* JADX INFO: renamed from: a */
                public final int f3523a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ AbstractC0322a f3524b;

                public ServiceConnectionC0325d(AbstractC0322a abstractC0322a, int i) {
/* 4 */             this.f3524b = abstractC0322a;
/* 6 */             this.f3523a = i;
                }

                @Override // android.content.ServiceConnection
                public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
/* 1 */             AbstractC0322a abstractC0322a = this.f3524b;
/* 3 */             if (iBinder == null) {
/* 7 */                 abstractC0322a.zzf(16);
/* 10 */                return;
                    }
                    synchronized (abstractC0322a.zzh()) {
                        try {
/* 18 */                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
/* 38 */                    abstractC0322a.zzi((iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof IGmsServiceBroker)) ? new C0323b(iBinder) : (IGmsServiceBroker) iInterfaceQueryLocalInterface);
                        } catch (Throwable th) {
/* 53 */                    throw th;
                        }
                    }
/* 48 */            this.f3524b.zzb(0, null, this.f3523a);
                }

                @Override // android.content.ServiceConnection
                public final void onServiceDisconnected(ComponentName componentName) {
/* 1 */             AbstractC0322a abstractC0322a = this.f3524b;
                    synchronized (abstractC0322a.zzh()) {
/* 9 */                 abstractC0322a.zzi(null);
                    }
/* 13 */            AbstractC0322a abstractC0322a2 = this.f3524b;
/* 15 */            int i = this.f3523a;
/* 17 */            Handler handler = abstractC0322a2.zzb;
/* 25 */            handler.sendMessage(handler.obtainMessage(6, i, 1));
                }
            }
