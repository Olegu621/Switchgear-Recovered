            package p000;

            import android.app.Activity;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.os.Bundle;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.internal.BinderWrapper;
            import com.google.android.gms.games.PlayerEntity;
            import com.google.android.gms.games.internal.zzap;
            import com.google.android.gms.internal.games_v2.zzan;
            import com.google.android.gms.internal.games_v2.zzc;
            import com.google.android.gms.internal.games_v2.zzez;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import java.util.Set;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class nd3 extends kr0 {

                /* JADX INFO: renamed from: a */
                public final gm3 f14194a;

                /* JADX INFO: renamed from: b */
                public final String f14195b;

                /* JADX INFO: renamed from: c */
                public PlayerEntity f14196c;

                /* JADX INFO: renamed from: d */
                public final sd3 f14197d;

                /* JADX INFO: renamed from: e */
                public boolean f14198e;

                /* JADX INFO: renamed from: f */
                public final long f14199f;

                /* JADX INFO: renamed from: i */
                public final in3 f14200i;

                /* JADX INFO: renamed from: v */
                public final td3 f14201v;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public nd3(Context context, Looper looper, C2345wv c2345wv, in3 in3Var, rr0 rr0Var, sr0 sr0Var) {
/* 10 */            super(context, looper, 1, c2345wv, rr0Var, sr0Var);
/* 1 */             td3 td3Var = td3.f17052b;
/* 18 */            this.f14194a = new gm3(this);
/* 21 */            this.f14198e = false;
/* 25 */            this.f14195b = c2345wv.f18827e;
/* 27 */            this.f14201v = td3Var;
/* 31 */            sd3 sd3Var = new sd3(this);
/* 34 */            this.f14197d = sd3Var;
/* 41 */            this.f14199f = hashCode();
/* 43 */            this.f14200i = in3Var;
/* 47 */            if (context instanceof Activity) {
/* 50 */                sd3Var.m8483b(null);
                    }
                }

                /* JADX INFO: renamed from: d */
                public static void m6969d(nd3 nd3Var, TaskCompletionSource taskCompletionSource) {
                    try {
/* 5 */                 zzap zzapVar = (zzap) nd3Var.getService();
/* 13 */                Parcel parcelZzb = zzapVar.zzb(25015, zzapVar.zza());
/* 23 */                PendingIntent pendingIntent = (PendingIntent) zzc.zza(parcelZzb, PendingIntent.CREATOR);
/* 25 */                parcelZzb.recycle();
/* 45 */                taskCompletionSource.setException(new vn0(new Status(26703, hu0.m4337f0(26703), pendingIntent, null)));
                    } catch (RemoteException e) {
/* 50 */                taskCompletionSource.setException(e);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m6970b(TaskCompletionSource taskCompletionSource, String str, int i, boolean z, boolean z2) {
/* 7 */             if (!str.equals("played_with") && !str.equals("friends_all")) {
/* 40 */                throw new IllegalArgumentException(str.length() != 0 ? "Invalid player collection: ".concat(str) : new String("Invalid player collection: "));
                    }
                    try {
/* 45 */                zzap zzapVar = (zzap) getService();
/* 50 */                bd3 bd3Var = new bd3(this, taskCompletionSource, 1);
/* 53 */                Parcel parcelZza = zzapVar.zza();
/* 57 */                zzc.zzf(parcelZza, bd3Var);
/* 60 */                parcelZza.writeString(str);
/* 63 */                parcelZza.writeInt(i);
/* 66 */                zzc.zzc(parcelZza, z);
/* 69 */                zzc.zzc(parcelZza, z2);
/* 74 */                zzapVar.zzc(9020, parcelZza);
                    } catch (SecurityException unused) {
/* 78 */                jb1.m5743I(taskCompletionSource);
                    }
                }

                /* JADX INFO: renamed from: c */
                public final void m6971c(TaskCompletionSource taskCompletionSource, String str, long j, String str2) throws RemoteException {
                    try {
/* 5 */                 zzap zzapVar = (zzap) getService();
/* 10 */                dd3 dd3Var = new dd3(taskCompletionSource, 4);
/* 13 */                Parcel parcelZza = zzapVar.zza();
/* 17 */                zzc.zzf(parcelZza, dd3Var);
/* 20 */                parcelZza.writeString(str);
/* 23 */                parcelZza.writeLong(j);
/* 26 */                parcelZza.writeString(str2);
/* 31 */                zzapVar.zzc(7002, parcelZza);
                    } catch (SecurityException unused) {
/* 35 */                jb1.m5743I(taskCompletionSource);
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final void connect(InterfaceC0881ei interfaceC0881ei) {
/* 2 */             this.f14196c = null;
/* 4 */             super.connect(interfaceC0881ei);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final IInterface createServiceInterface(IBinder iBinder) {
/* 1 */             if (iBinder == null) {
/* 3 */                 return null;
                    }
/* 7 */             IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.games.internal.IGamesService");
                    return iInterfaceQueryLocalInterface instanceof zzap ? (zzap) iInterfaceQueryLocalInterface : new zzap(iBinder, "com.google.android.gms.games.internal.IGamesService");
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final void disconnect() {
/* 2 */             this.f14198e = false;
/* 8 */             if (isConnected()) {
                        try {
/* 12 */                    this.f14194a.zzb();
/* 19 */                    zzap zzapVar = (zzap) getService();
/* 21 */                    long j = this.f14199f;
/* 23 */                    Parcel parcelZza = zzapVar.zza();
/* 27 */                    parcelZza.writeLong(j);
/* 32 */                    zzapVar.zzc(5001, parcelZza);
                        } catch (RemoteException unused) {
/* 40 */                    zzez.zzg("GamesGmsClientImpl", "Failed to notify client disconnect.");
                        }
                    }
/* 43 */            super.disconnect();
                }

                /* JADX INFO: renamed from: e */
                public final void m6972e() {
/* 5 */             if (isConnected()) {
                        try {
/* 11 */                    zzap zzapVar = (zzap) getService();
/* 19 */                    zzapVar.zzc(5006, zzapVar.zza());
                        } catch (RemoteException e) {
/* 28 */                    zzez.zzh("GamesGmsClientImpl", "service died", e);
                        }
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Feature[] getApiFeatures() {
/* 1 */             return he3.f9037e;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getConnectionHint() {
/* 1 */             return null;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final Bundle getGetServiceRequestExtraArgs() {
/* 15 */            String string = getContext().getResources().getConfiguration().locale.toString();
/* 19 */            in3 in3Var = this.f14200i;
/* 21 */            in3Var.getClass();
/* 26 */            Bundle bundle = new Bundle();
/* 32 */            bundle.putBoolean("com.google.android.gms.games.key.isHeadless", false);
/* 38 */            bundle.putBoolean("com.google.android.gms.games.key.showConnectingPopup", true);
/* 45 */            bundle.putInt("com.google.android.gms.games.key.connectingPopupGravity", 17);
/* 50 */            bundle.putBoolean("com.google.android.gms.games.key.retryingSignIn", false);
/* 57 */            bundle.putInt("com.google.android.gms.games.key.sdkVariant", in3Var.f9729a);
/* 63 */            bundle.putString("com.google.android.gms.games.key.forceResolveAccountKey", null);
/* 70 */            bundle.putStringArrayList("com.google.android.gms.games.key.proxyApis", in3Var.f9730b);
/* 75 */            bundle.putBoolean("com.google.android.gms.games.key.unauthenticated", false);
/* 80 */            bundle.putBoolean("com.google.android.gms.games.key.skipPgaCheck", false);
/* 85 */            bundle.putBoolean("com.google.android.gms.games.key.skipWelcomePopup", false);
/* 92 */            bundle.putParcelable("com.google.android.gms.games.key.googleSignInAccount", in3Var.f9731c);
/* 97 */            bundle.putString("com.google.android.gms.games.key.realClientPackageName", null);
/* 104 */           bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
/* 111 */           bundle.putString("com.google.android.gms.games.key.gameRunToken", in3Var.f9732d);
/* 118 */           bundle.putString("com.google.android.gms.games.key.gamePackageName", this.f14195b);
/* 123 */           bundle.putString("com.google.android.gms.games.key.desiredLocale", string);
/* 139 */           bundle.putParcelable("com.google.android.gms.games.key.popupWindowToken", new BinderWrapper(this.f14197d.f16543b.zza));
/* 146 */           if (!bundle.containsKey("com.google.android.gms.games.key.API_VERSION")) {
/* 148 */               bundle.putInt("com.google.android.gms.games.key.API_VERSION", 9);
                    }
/* 161 */           bundle.putBundle("com.google.android.gms.games.key.signInOptions", ie2.m4519b(getClientSettings()));
/* 164 */           return bundle;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final int getMinApkVersion() {
/* 1 */             return 12451000;
                }

                @Override // p000.kr0, p000.InterfaceC0836d9
                public final Set getScopesForConnectionlessNonSignIn() {
/* 1 */             return getScopes();
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getServiceDescriptor() {
/* 1 */             return "com.google.android.gms.games.internal.IGamesService";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final String getStartServiceAction() {
/* 1 */             return "com.google.android.gms.games.service.START";
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final void onConnectedLocked(IInterface iInterface) {
/* 1 */             zzap zzapVar = (zzap) iInterface;
/* 3 */             super.onConnectedLocked(zzapVar);
/* 6 */             boolean z = this.f14198e;
/* 8 */             sd3 sd3Var = this.f14197d;
/* 10 */            if (z) {
/* 12 */                sd3Var.m8484c();
/* 16 */                this.f14198e = false;
                    }
/* 20 */            this.f14200i.getClass();
                    try {
/* 32 */                jn3 jn3Var = new jn3(new zzan(sd3Var.f16543b));
/* 35 */                long j = this.f14199f;
/* 37 */                Parcel parcelZza = zzapVar.zza();
/* 41 */                zzc.zzf(parcelZza, jn3Var);
/* 44 */                parcelZza.writeLong(j);
/* 49 */                zzapVar.zzc(15501, parcelZza);
                    } catch (RemoteException e) {
/* 58 */                zzez.zzh("GamesGmsClientImpl", "service died", e);
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final void onConnectionFailed(ConnectionResult connectionResult) {
/* 1 */             super.onConnectionFailed(connectionResult);
/* 5 */             this.f14198e = false;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
/* 1 */             if (i == 0) {
/* 3 */                 i = 0;
/* 4 */                 if (bundle != null) {
/* 12 */                    bundle.setClassLoader(nd3.class.getClassLoader());
/* 21 */                    this.f14198e = bundle.getBoolean("show_welcome_popup");
/* 31 */                    this.f14196c = (PlayerEntity) bundle.getParcelable("com.google.android.gms.games.current_player");
                        }
                    }
/* 41 */            super.onPostInitHandler(i, iBinder, bundle, i2);
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final void onUserSignOut(InterfaceC0918fi interfaceC0918fi) {
                    try {
/* 3 */                 qf3 qf3Var = new qf3(interfaceC0918fi);
/* 8 */                 this.f14194a.zzb();
                        try {
/* 15 */                    zzap zzapVar = (zzap) getService();
/* 21 */                    dd3 dd3Var = new dd3(qf3Var, 14);
/* 24 */                    Parcel parcelZza = zzapVar.zza();
/* 28 */                    zzc.zzf(parcelZza, dd3Var);
/* 33 */                    zzapVar.zzc(5002, parcelZza);
                        } catch (SecurityException unused) {
/* 38 */                    hu0.m4337f0(4);
/* 47 */                    ((fs0) ((InterfaceC0918fi) qf3Var.f15523a)).m3825v();
                        }
                    } catch (RemoteException unused2) {
/* 53 */                ((fs0) interfaceC0918fi).m3825v();
                    }
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean requiresAccount() {
/* 1 */             return true;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a, p000.InterfaceC0836d9
                public final boolean requiresSignIn() {
                    return !this.f14200i.f9733e.f14372c;
                }

                @Override // com.google.android.gms.common.internal.AbstractC0322a
                public final boolean usesClientTelemetry() {
/* 1 */             return true;
                }
            }
