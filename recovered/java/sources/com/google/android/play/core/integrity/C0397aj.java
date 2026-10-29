            package com.google.android.play.core.integrity;

            import android.app.Activity;
            import android.content.Context;
            import android.content.pm.PackageManager;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Parcelable;
            import android.util.Base64;
            import android.util.Log;
            import com.google.android.gms.tasks.Task;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.gms.tasks.Tasks;
            import com.google.android.play.integrity.internal.AbstractBinderC0471m;
            import com.google.android.play.integrity.internal.C0470l;
            import com.google.android.play.integrity.internal.InterfaceC0472n;
            import java.util.ArrayList;
            import p000.ba3;
            import p000.mn0;
            import p000.pa3;
            import p000.qa3;
            import p000.ua3;
            import p000.z93;
            
            /* JADX INFO: renamed from: com.google.android.play.core.integrity.aj */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class C0397aj {

                /* JADX INFO: renamed from: a */
                final z93 f5167a;

                /* JADX INFO: renamed from: b */
                private final qa3 f5168b;

                /* JADX INFO: renamed from: c */
                private final String f5169c;

                /* JADX INFO: renamed from: d */
                private final Context f5170d;

                /* JADX INFO: renamed from: e */
                private final C0407at f5171e;

                /* JADX INFO: renamed from: f */
                private final InterfaceC0445k f5172f;

                public C0397aj(Context context, qa3 qa3Var, C0407at c0407at, InterfaceC0445k interfaceC0445k) {
/* 8 */             this.f5169c = context.getPackageName();
/* 10 */            this.f5168b = qa3Var;
/* 12 */            this.f5171e = c0407at;
/* 14 */            this.f5172f = interfaceC0445k;
/* 16 */            this.f5170d = context;
/* 22 */            qa3 qa3Var2 = ba3.f2340a;
                    try {
/* 35 */                if (context.getPackageManager().getApplicationInfo("com.android.vending", 0).enabled) {
                            try {
/* 62 */                        if (ba3.m1311b(context.getPackageManager().getPackageInfo("com.android.vending", 64).signatures)) {
/* 80 */                            this.f5167a = new z93(context, qa3Var, "IntegrityService", C0398ak.f5173a, new ua3() { // from class: com.google.android.play.core.integrity.ae
                                        @Override // p000.ua3
                                        /* JADX INFO: renamed from: a */
                                        public final Object mo2451a(IBinder iBinder) {
/* 1 */                                     int i = AbstractBinderC0471m.f5281i;
/* 3 */                                     if (iBinder == null) {
/* 5 */                                         return null;
                                            }
/* 9 */                                     IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.integrity.protocol.IIntegrityService");
                                            return iInterfaceQueryLocalInterface instanceof InterfaceC0472n ? (InterfaceC0472n) iInterfaceQueryLocalInterface : new C0470l(iBinder, "com.google.android.play.core.integrity.protocol.IIntegrityService");
                                        }
                                    });
/* 82 */                            return;
                                }
                            } catch (PackageManager.NameNotFoundException unused) {
/* 86 */                        qa3Var2.m7757c("Play Store package is not found.", new Object[0]);
                            }
                        } else {
/* 41 */                    qa3Var2.m7757c("Play Store package is disabled.", new Object[0]);
                        }
                    } catch (PackageManager.NameNotFoundException unused2) {
/* 93 */                qa3Var2.m7757c("Play Store package is not found.", new Object[0]);
                    }
/* 96 */            Object[] objArr = new Object[0];
/* 105 */           if (Log.isLoggable("PlayCore", 6)) {
/* 111 */               qa3.m7754d(qa3Var.f15477a, "Phonesky is not installed.", objArr);
                    } else {
/* 115 */               qa3Var.getClass();
                    }
/* 119 */           this.f5167a = null;
                }

                /* JADX INFO: renamed from: a */
                public static Bundle m2456a(C0397aj c0397aj, byte[] bArr, Long l, Parcelable parcelable) {
/* 3 */             Bundle bundle = new Bundle();
/* 10 */            bundle.putString("package.name", c0397aj.f5169c);
/* 15 */            bundle.putByteArray("nonce", bArr);
/* 21 */            bundle.putInt("playcore.integrity.version.major", 1);
/* 27 */            bundle.putInt("playcore.integrity.version.minor", 4);
/* 33 */            bundle.putInt("playcore.integrity.version.patch", 0);
/* 36 */            if (l != null) {
/* 44 */                bundle.putLong("cloud.prj", l.longValue());
                    }
/* 47 */            if (parcelable != null) {
/* 51 */                bundle.putParcelable("network", parcelable);
                    }
/* 56 */            ArrayList arrayList = new ArrayList();
/* 69 */            arrayList.add(new pa3(3, System.currentTimeMillis()));
/* 83 */            bundle.putParcelableArrayList("event_timestamps", new ArrayList<>(mn0.m6685a(arrayList)));
/* 86 */            return bundle;
                }

                /* JADX INFO: renamed from: b */
                public final Task m2461b(Activity activity, Bundle bundle) {
/* 3 */             if (this.f5167a == null) {
/* 12 */                return Tasks.forException(new IntegrityServiceException(-2, null));
                    }
/* 19 */            int i = bundle.getInt("dialog.intent.type");
/* 37 */            this.f5168b.m7756b("requestAndShowDialog(%s, %s)", this.f5169c, Integer.valueOf(i));
/* 42 */            TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 56 */            this.f5167a.m10290c(new C0394ag(this, taskCompletionSource, bundle, activity, taskCompletionSource, i), taskCompletionSource);
/* 59 */            return taskCompletionSource.getTask();
                }

                /* JADX INFO: renamed from: c */
                public final Task m2462c(IntegrityTokenRequest integrityTokenRequest) {
/* 4 */             if (this.f5167a == null) {
/* 98 */                return Tasks.forException(new IntegrityServiceException(-2, null));
                    }
/* 15 */            if (ba3.m1310a(this.f5170d) < 82380000) {
/* 87 */                return Tasks.forException(new IntegrityServiceException(-14, null));
                    }
                    try {
/* 23 */                byte[] bArrDecode = Base64.decode(integrityTokenRequest.nonce(), 10);
/* 27 */                Long lCloudProjectNumber = integrityTokenRequest.cloudProjectNumber();
/* 39 */                this.f5168b.m7756b("requestIntegrityToken(%s)", integrityTokenRequest);
/* 44 */                TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
/* 58 */                this.f5167a.m10290c(new C0393af(this, taskCompletionSource, bArrDecode, lCloudProjectNumber, null, taskCompletionSource, integrityTokenRequest), taskCompletionSource);
/* 61 */                return taskCompletionSource.getTask();
                    } catch (IllegalArgumentException e) {
/* 75 */                return Tasks.forException(new IntegrityServiceException(-13, e));
                    }
                }
            }
