            package p000;

            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class gg3 extends ad3 {

                /* JADX INFO: renamed from: g */
                public final IBinder f8608g;

                /* JADX INFO: renamed from: h */
                public final /* synthetic */ AbstractC0322a f8609h;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public gg3(AbstractC0322a abstractC0322a, int i, IBinder iBinder, Bundle bundle) {
/* 3 */             super(abstractC0322a, i, bundle);
/* 1 */             this.f8609h = abstractC0322a;
/* 6 */             this.f8608g = iBinder;
                }

                @Override // p000.ad3
                /* JADX INFO: renamed from: a */
                public final boolean mo205a() {
/* 3 */             IBinder iBinder = this.f8608g;
                    try {
/* 6 */                 kb1.m6061n(iBinder);
/* 12 */                String interfaceDescriptor = iBinder.getInterfaceDescriptor();
/* 16 */                AbstractC0322a abstractC0322a = this.f8609h;
/* 26 */                if (!abstractC0322a.getServiceDescriptor().equals(interfaceDescriptor)) {
/* 28 */                    String serviceDescriptor = abstractC0322a.getServiceDescriptor();
/* 64 */                    AbstractC1245n0.m4889q("GmsClient", fm0.m3791q(new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length()), "service descriptor mismatch: ", serviceDescriptor, " vs. ", interfaceDescriptor));
/* 5 */                     return false;
                        }
/* 68 */                IInterface iInterfaceCreateServiceInterface = abstractC0322a.createServiceInterface(iBinder);
/* 72 */                if (iInterfaceCreateServiceInterface == null || !(abstractC0322a.zze(2, 4, iInterfaceCreateServiceInterface) || abstractC0322a.zze(3, 4, iInterfaceCreateServiceInterface))) {
/* 5 */                     return false;
                        }
/* 90 */                abstractC0322a.zzn(null);
/* 93 */                InterfaceC0217ci interfaceC0217ciZzk = abstractC0322a.zzk();
/* 97 */                Bundle connectionHint = abstractC0322a.getConnectionHint();
/* 101 */               if (interfaceC0217ciZzk == null) {
/* 110 */                   return true;
                        }
/* 107 */               abstractC0322a.zzk().mo199d(connectionHint);
/* 110 */               return true;
                    } catch (RemoteException unused) {
/* 115 */               AbstractC1245n0.m4889q("GmsClient", "service probably died");
/* 5 */                 return false;
                    }
                }

                @Override // p000.ad3
                /* JADX INFO: renamed from: b */
                public final void mo206b(ConnectionResult connectionResult) {
/* 1 */             AbstractC0322a abstractC0322a = this.f8609h;
/* 7 */             if (abstractC0322a.zzl() != null) {
/* 13 */                abstractC0322a.zzl().mo3086b(connectionResult);
                    }
/* 16 */            abstractC0322a.onConnectionFailed(connectionResult);
                }
            }
