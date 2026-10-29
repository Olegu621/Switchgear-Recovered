            package com.google.android.gms.common.internal;

            import android.accounts.Account;
            import android.app.PendingIntent;
            import android.content.Context;
            import android.content.Intent;
            import android.os.Bundle;
            import android.os.DeadObjectException;
            import android.os.Handler;
            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.Looper;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Scope;
            import io.sentry.android.core.AbstractC1245n0;
            import java.io.FileDescriptor;
            import java.io.PrintWriter;
            import java.text.SimpleDateFormat;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.Date;
            import java.util.Locale;
            import java.util.Set;
            import java.util.concurrent.Executor;
            import java.util.concurrent.atomic.AtomicInteger;
            import p000.AbstractC0016ae;
            import p000.InterfaceC0217ci;
            import p000.InterfaceC0845di;
            import p000.InterfaceC0881ei;
            import p000.InterfaceC0918fi;
            import p000.ad3;
            import p000.d52;
            import p000.dq3;
            import p000.er3;
            import p000.f42;
            import p000.fn3;
            import p000.fs0;
            import p000.gg3;
            import p000.gr0;
            import p000.hu0;
            import p000.kb1;
            import p000.lr0;
            import p000.qr0;
            
            /* JADX INFO: renamed from: com.google.android.gms.common.internal.a */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 53 */    public abstract class AbstractC0322a {
                public static final int CONNECT_STATE_CONNECTED = 4;
                public static final int CONNECT_STATE_DISCONNECTED = 1;
                public static final int CONNECT_STATE_DISCONNECTING = 5;
                public static final String DEFAULT_ACCOUNT = "<<default account>>";
                public static final String KEY_PENDING_INTENT = "pendingIntent";
                private volatile String zzA;
                private volatile AbstractC0016ae zzB;
                er3 zza;
                final Handler zzb;
                protected InterfaceC0881ei zzc;
                private int zzf;
                private long zzg;
                private long zzh;
                private int zzi;
                private long zzj;
                private final Context zzl;
                private final Looper zzm;
                private final lr0 zzn;
                private final qr0 zzo;
                private IGmsServiceBroker zzr;
                private IInterface zzs;
                private ServiceConnectionC0325d zzu;
                private final InterfaceC0217ci zzw;
                private final InterfaceC0845di zzx;
                private final int zzy;
                private final String zzz;
                private static final Feature[] zze = new Feature[0];
                public static final String[] GOOGLE_PLUS_REQUIRED_FEATURES = {"service_esmobile", "service_googleme"};
                private volatile String zzk = null;
                private final Object zzp = new Object();
                private final Object zzq = new Object();
                private final ArrayList zzt = new ArrayList();
                private int zzv = 1;
                private ConnectionResult zzC = null;
                private boolean zzD = false;
                private volatile zzj zzE = null;
                protected AtomicInteger zzd = new AtomicInteger(0);

                public AbstractC0322a(Context context, Looper looper, dq3 dq3Var, qr0 qr0Var, int i, InterfaceC0217ci interfaceC0217ci, InterfaceC0845di interfaceC0845di, String str) {
/* 47 */            kb1.m6062o(context, "Context must not be null");
/* 50 */            this.zzl = context;
/* 54 */            kb1.m6062o(looper, "Looper must not be null");
/* 57 */            this.zzm = looper;
/* 61 */            kb1.m6062o(dq3Var, "Supervisor must not be null");
/* 64 */            this.zzn = dq3Var;
/* 68 */            kb1.m6062o(qr0Var, "API availability must not be null");
/* 71 */            this.zzo = qr0Var;
/* 78 */            this.zzb = new HandlerC0324c(this, looper);
/* 80 */            this.zzy = i;
/* 82 */            this.zzw = interfaceC0217ci;
/* 84 */            this.zzx = interfaceC0845di;
/* 86 */            this.zzz = str;
                }

                /* JADX INFO: renamed from: a */
                public final void m2021a(int i, IInterface iInterface) {
                    er3 er3Var;
/* 19 */            kb1.m6054g((i == 4) == (iInterface != null));
                    synchronized (this.zzp) {
                        try {
/* 25 */                    this.zzv = i;
/* 27 */                    this.zzs = iInterface;
/* 29 */                    Bundle bundle = null;
/* 30 */                    if (i == 1) {
/* 365 */                       ServiceConnectionC0325d serviceConnectionC0325d = this.zzu;
/* 367 */                       if (serviceConnectionC0325d != null) {
/* 369 */                           lr0 lr0Var = this.zzn;
/* 373 */                           String str = this.zza.f7855a;
/* 375 */                           kb1.m6061n(str);
/* 380 */                           String str2 = this.zza.f7856b;
/* 382 */                           zza();
/* 389 */                           lr0Var.m6524c(str, str2, serviceConnectionC0325d, this.zza.f7857c);
/* 392 */                           this.zzu = null;
                                }
                            } else if (i == 2 || i == 3) {
/* 63 */                        ServiceConnectionC0325d serviceConnectionC0325d2 = this.zzu;
/* 65 */                        if (serviceConnectionC0325d2 != null && (er3Var = this.zza) != null) {
/* 73 */                            String str3 = er3Var.f7855a;
/* 75 */                            String str4 = er3Var.f7856b;
/* 98 */                            StringBuilder sb = new StringBuilder(String.valueOf(str3).length() + 70 + String.valueOf(str4).length());
/* 101 */                           sb.append("Calling connect() while still connected, missing disconnect() for ");
/* 104 */                           sb.append(str3);
/* 107 */                           sb.append(" on ");
/* 110 */                           sb.append(str4);
/* 117 */                           AbstractC1245n0.m4876d("GmsClient", sb.toString());
/* 120 */                           lr0 lr0Var2 = this.zzn;
/* 124 */                           String str5 = this.zza.f7855a;
/* 126 */                           kb1.m6061n(str5);
/* 131 */                           String str6 = this.zza.f7856b;
/* 133 */                           zza();
/* 140 */                           lr0Var2.m6524c(str5, str6, serviceConnectionC0325d2, this.zza.f7857c);
/* 145 */                           this.zzd.incrementAndGet();
                                }
/* 156 */                       ServiceConnectionC0325d serviceConnectionC0325d3 = new ServiceConnectionC0325d(this, this.zzd.get());
/* 159 */                       this.zzu = serviceConnectionC0325d3;
/* 203 */                       er3 er3Var2 = (this.zzv != 3 || getLocalStartServiceAction() == null) ? new er3(getStartServicePackage(), getStartServiceAction(), getUseDynamicLookup()) : new er3(getContext().getPackageName(), getLocalStartServiceAction(), false);
/* 206 */                       this.zza = er3Var2;
/* 210 */                       if (er3Var2.f7857c && getMinApkVersion() < 17895000) {
/* 239 */                           throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.zza.f7855a)));
                                }
/* 240 */                       lr0 lr0Var3 = this.zzn;
/* 244 */                       String str7 = this.zza.f7855a;
/* 246 */                       kb1.m6061n(str7);
/* 270 */                       ConnectionResult connectionResultMo3177b = lr0Var3.mo3177b(new fn3(str7, this.zza.f7856b, this.zza.f7857c), serviceConnectionC0325d3, zza(), getBindServiceExecutor());
/* 279 */                       if (!(connectionResultMo3177b.f3416b == 0)) {
/* 283 */                           er3 er3Var3 = this.zza;
/* 285 */                           String str8 = er3Var3.f7855a;
/* 287 */                           String str9 = er3Var3.f7856b;
/* 310 */                           StringBuilder sb2 = new StringBuilder(String.valueOf(str8).length() + 34 + String.valueOf(str9).length());
/* 313 */                           sb2.append("unable to connect to service: ");
/* 316 */                           sb2.append(str8);
/* 319 */                           sb2.append(" on ");
/* 322 */                           sb2.append(str9);
/* 329 */                           AbstractC1245n0.m4889q("GmsClient", sb2.toString());
/* 332 */                           int i2 = connectionResultMo3177b.f3416b;
/* 335 */                           if (i2 == -1) {
/* 337 */                               i2 = 16;
                                    }
/* 341 */                           if (connectionResultMo3177b.f3417c != null) {
/* 345 */                               bundle = new Bundle();
/* 352 */                               bundle.putParcelable(KEY_PENDING_INTENT, connectionResultMo3177b.f3417c);
                                    }
/* 361 */                           zzb(i2, bundle, this.zzd.get());
                                }
                            } else if (i == 4) {
/* 42 */                        kb1.m6061n(iInterface);
/* 47 */                        onConnectedLocked(iInterface);
                            }
                        } catch (Throwable th) {
/* 397 */                   throw th;
                        }
                    }
                }

                public void checkAvailabilityAndConnect() {
/* 9 */             int iM8004c = this.zzo.m8004c(this.zzl, getMinApkVersion());
/* 13 */            if (iM8004c == 0) {
/* 34 */                connect(new gr0(this));
                    } else {
/* 17 */                m2021a(1, null);
/* 25 */                triggerNotAvailable(new gr0(this), iM8004c, null);
                    }
                }

                public final void checkConnected() {
/* 5 */             if (isConnected()) {
/* 7 */                 return;
                    }
/* 10 */            f42.m3656l("Not connected. Call connect() and wait for onConnected() to be called.");
                }

                public void connect(InterfaceC0881ei interfaceC0881ei) {
/* 3 */             kb1.m6062o(interfaceC0881ei, "Connection progress callbacks cannot be null.");
/* 6 */             this.zzc = interfaceC0881ei;
/* 10 */            m2021a(2, null);
                }

                public abstract IInterface createServiceInterface(IBinder iBinder);

                public void disconnect() {
/* 3 */             this.zzd.incrementAndGet();
/* 6 */             ArrayList arrayList = this.zzt;
                    synchronized (arrayList) {
                        try {
/* 9 */                     int size = arrayList.size();
/* 15 */                    for (int i = 0; i < size; i++) {
/* 21 */                        ad3 ad3Var = (ad3) arrayList.get(i);
                                synchronized (ad3Var) {
/* 24 */                            ad3Var.f190a = null;
                                }
                            }
/* 35 */                    arrayList.clear();
                        } catch (Throwable th) {
/* 54 */                    throw th;
                        }
                    }
                    synchronized (this.zzq) {
/* 42 */                this.zzr = null;
                    }
/* 46 */            m2021a(1, null);
                }

                public void dump(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
                    int i;
                    IInterface iInterface;
                    IGmsServiceBroker iGmsServiceBroker;
                    synchronized (this.zzp) {
/* 10 */                i = this.zzv;
/* 12 */                iInterface = this.zzs;
                    }
                    synchronized (this.zzq) {
/* 18 */                iGmsServiceBroker = this.zzr;
                    }
/* 27 */            printWriter.append((CharSequence) str).append("mConnectState=");
/* 33 */            if (i == 1) {
/* 77 */                printWriter.print("DISCONNECTED");
                    } else if (i == 2) {
/* 71 */                printWriter.print("REMOTE_CONNECTING");
                    } else if (i == 3) {
/* 65 */                printWriter.print("LOCAL_CONNECTING");
                    } else if (i == 4) {
/* 59 */                printWriter.print("CONNECTED");
                    } else if (i != 5) {
/* 47 */                printWriter.print("UNKNOWN");
                    } else {
/* 53 */                printWriter.print("DISCONNECTING");
                    }
/* 82 */            printWriter.append(" mService=");
/* 85 */            if (iInterface == null) {
/* 89 */                printWriter.append("null");
                    } else {
/* 119 */               printWriter.append((CharSequence) getServiceDescriptor()).append("@").append((CharSequence) Integer.toHexString(System.identityHashCode(iInterface.asBinder())));
                    }
/* 124 */           printWriter.append(" mServiceBroker=");
/* 127 */           if (iGmsServiceBroker == null) {
/* 131 */               printWriter.println("null");
                    } else {
/* 153 */               printWriter.append("IGmsServiceBroker@").println(Integer.toHexString(System.identityHashCode(iGmsServiceBroker.asBinder())));
                    }
/* 162 */           SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS", Locale.US);
/* 173 */           if (this.zzh > 0) {
/* 181 */               PrintWriter printWriterAppend = printWriter.append((CharSequence) str).append("lastConnectedTime=");
/* 185 */               long j = this.zzh;
/* 192 */               String str2 = simpleDateFormat.format(new Date(j));
/* 218 */               StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 1 + String.valueOf(str2).length());
/* 221 */               sb.append(j);
/* 224 */               sb.append(" ");
/* 227 */               sb.append(str2);
/* 234 */               printWriterAppend.println(sb.toString());
                    }
/* 244 */           if (this.zzg > r9) {
/* 252 */               printWriter.append((CharSequence) str).append("lastSuspendedCause=");
/* 255 */               int i2 = this.zzf;
/* 257 */               if (i2 == 1) {
/* 285 */                   printWriter.append("CAUSE_SERVICE_DISCONNECTED");
                        } else if (i2 == 2) {
/* 279 */                   printWriter.append("CAUSE_NETWORK_LOST");
                        } else if (i2 != 3) {
/* 267 */                   printWriter.append((CharSequence) String.valueOf(i2));
                        } else {
/* 273 */                   printWriter.append("CAUSE_DEAD_OBJECT_EXCEPTION");
                        }
/* 290 */               PrintWriter printWriterAppend2 = printWriter.append(" lastSuspendedTime=");
/* 294 */               long j2 = this.zzg;
/* 301 */               String str3 = simpleDateFormat.format(new Date(j2));
/* 325 */               StringBuilder sb2 = new StringBuilder(String.valueOf(j2).length() + 1 + String.valueOf(str3).length());
/* 328 */               sb2.append(j2);
/* 331 */               sb2.append(" ");
/* 334 */               sb2.append(str3);
/* 341 */               printWriterAppend2.println(sb2.toString());
                    }
/* 348 */           if (this.zzj > 0) {
/* 366 */               printWriter.append((CharSequence) str).append("lastFailedStatus=").append((CharSequence) hu0.m4338g0(this.zzi));
/* 371 */               PrintWriter printWriterAppend3 = printWriter.append(" lastFailedTime=");
/* 375 */               long j3 = this.zzj;
/* 382 */               String str4 = simpleDateFormat.format(new Date(j3));
/* 406 */               StringBuilder sb3 = new StringBuilder(String.valueOf(j3).length() + 1 + String.valueOf(str4).length());
/* 409 */               sb3.append(j3);
/* 412 */               sb3.append(" ");
/* 415 */               sb3.append(str4);
/* 422 */               printWriterAppend3.println(sb3.toString());
                    }
                }

                public boolean enableLocalFallback() {
/* 1 */             return false;
                }

                public Account getAccount() {
/* 1 */             return null;
                }

                public Feature[] getApiFeatures() {
/* 1 */             return zze;
                }

                public AbstractC0016ae getAttributionSourceWrapper() {
/* 1 */             return null;
                }

                public final Feature[] getAvailableFeatures() {
/* 1 */             zzj zzjVar = this.zzE;
/* 3 */             if (zzjVar == null) {
/* 5 */                 return null;
                    }
/* 7 */             return zzjVar.f3544b;
                }

                public Executor getBindServiceExecutor() {
/* 1 */             return null;
                }

                public Bundle getConnectionHint() {
/* 1 */             return null;
                }

                public final Context getContext() {
/* 1 */             return this.zzl;
                }

                public String getEndpointPackageName() {
                    er3 er3Var;
/* 5 */             if (isConnected() && (er3Var = this.zza) != null) {
/* 11 */                return er3Var.f7856b;
                    }
/* 16 */            f42.m3663s("Failed to connect when checking package");
/* 19 */            return null;
                }

                public int getGCoreServiceId() {
/* 1 */             return this.zzy;
                }

                public Bundle getGetServiceRequestExtraArgs() {
/* 3 */             return new Bundle();
                }

                public String getLastDisconnectMessage() {
/* 1 */             return this.zzk;
                }

                public String getLocalStartServiceAction() {
/* 1 */             return null;
                }

                public final Looper getLooper() {
/* 1 */             return this.zzm;
                }

                public abstract int getMinApkVersion();

                public void getRemoteService(IAccountAccessor iAccountAccessor, Set<Scope> set) {
/* 5 */             Bundle getServiceRequestExtraArgs = getGetServiceRequestExtraArgs();
/* 11 */            String str = this.zzA;
/* 13 */            int i = this.zzy;
/* 15 */            int i2 = qr0.f15711a;
/* 17 */            Scope[] scopeArr = GetServiceRequest.f3487Z;
/* 21 */            Bundle bundle = new Bundle();
/* 24 */            Feature[] featureArr = GetServiceRequest.f3488a0;
/* 37 */            GetServiceRequest getServiceRequest = new GetServiceRequest(6, i, i2, null, null, scopeArr, bundle, null, featureArr, featureArr, true, 0, false, str);
/* 46 */            getServiceRequest.f3497d = this.zzl.getPackageName();
/* 48 */            getServiceRequest.f3500i = getServiceRequestExtraArgs;
/* 50 */            if (set != null) {
/* 61 */                getServiceRequest.f3499f = (Scope[]) set.toArray(new Scope[0]);
                    }
/* 67 */            if (requiresSignIn()) {
/* 69 */                Account account = getAccount();
/* 73 */                if (account == null) {
/* 81 */                    account = new Account(DEFAULT_ACCOUNT, "com.google");
                        }
/* 84 */                getServiceRequest.f3501v = account;
/* 86 */                if (iAccountAccessor != null) {
/* 92 */                    getServiceRequest.f3498e = iAccountAccessor.asBinder();
                        }
                    } else if (requiresAccount()) {
/* 105 */               getServiceRequest.f3501v = getAccount();
                    }
/* 109 */           getServiceRequest.f3502w = zze;
/* 115 */           getServiceRequest.f3489U = getApiFeatures();
/* 121 */           if (usesClientTelemetry()) {
/* 124 */               getServiceRequest.f3492X = true;
                    }
                    try {
                        synchronized (this.zzq) {
                            try {
/* 129 */                       IGmsServiceBroker iGmsServiceBroker = this.zzr;
/* 131 */                       if (iGmsServiceBroker != null) {
/* 144 */                           iGmsServiceBroker.mo2020j(new zzd(this, this.zzd.get()), getServiceRequest);
                                } else {
/* 154 */                           AbstractC1245n0.m4889q("GmsClient", "mServiceBroker is null, client disconnected");
                                }
                            } catch (Throwable th) {
/* 160 */                       throw th;
                            }
                        }
                    } catch (DeadObjectException e) {
/* 193 */               AbstractC1245n0.m4891s("GmsClient", "IGmsServiceBroker.getService failed", e);
/* 197 */               triggerConnectionSuspended(3);
                    } catch (RemoteException e2) {
/* 163 */               e = e2;
/* 171 */               AbstractC1245n0.m4891s("GmsClient", "IGmsServiceBroker.getService failed", e);
/* 183 */               onPostInitHandler(8, null, null, this.zzd.get());
                    } catch (SecurityException e3) {
/* 188 */               throw e3;
                    } catch (RuntimeException e4) {
/* 161 */               e = e4;
/* 171 */               AbstractC1245n0.m4891s("GmsClient", "IGmsServiceBroker.getService failed", e);
/* 183 */               onPostInitHandler(8, null, null, this.zzd.get());
                    }
                }

                public Set getScopes() {
/* 1 */             return Collections.EMPTY_SET;
                }

                public final IInterface getService() throws DeadObjectException {
                    IInterface iInterface;
                    synchronized (this.zzp) {
                        try {
/* 7 */                     if (this.zzv == 5) {
/* 30 */                        throw new DeadObjectException();
                            }
/* 9 */                     checkConnected();
/* 12 */                    IInterface iInterface2 = this.zzs;
/* 16 */                    kb1.m6062o(iInterface2, "Client is connected but service is null");
/* 19 */                    iInterface = iInterface2;
                        } catch (Throwable th) {
/* 32 */                    throw th;
                        }
                    }
/* 22 */            return iInterface;
                }

                public IBinder getServiceBrokerBinder() {
                    synchronized (this.zzq) {
                        try {
/* 4 */                     IGmsServiceBroker iGmsServiceBroker = this.zzr;
/* 6 */                     if (iGmsServiceBroker == null) {
/* 9 */                         return null;
                            }
/* 13 */                    return iGmsServiceBroker.asBinder();
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }

                public abstract String getServiceDescriptor();

                public Intent getSignInIntent() {
/* 8 */             throw new UnsupportedOperationException("Not a sign in API");
                }

                public abstract String getStartServiceAction();

                public String getStartServicePackage() {
/* 1 */             return "com.google.android.gms";
                }

                public ConnectionTelemetryConfiguration getTelemetryConfiguration() {
/* 1 */             zzj zzjVar = this.zzE;
/* 3 */             if (zzjVar == null) {
/* 5 */                 return null;
                    }
/* 7 */             return zzjVar.f3546d;
                }

                public boolean getUseDynamicLookup() {
                    return getMinApkVersion() >= 211700000;
                }

                public boolean hasConnectionInfo() {
                    return this.zzE != null;
                }

                public boolean isConnected() {
                    boolean z;
                    synchronized (this.zzp) {
/* 11 */                z = this.zzv == 4;
                    }
/* 13 */            return z;
                }

                public boolean isConnecting() {
                    boolean z;
                    synchronized (this.zzp) {
/* 4 */                 int i = this.zzv;
/* 7 */                 z = true;
/* 8 */                 if (i != 2 && i != 3) {
/* 14 */                    z = false;
                        }
                    }
/* 16 */            return z;
                }

                public void onConnectedLocked(IInterface iInterface) {
/* 5 */             this.zzh = System.currentTimeMillis();
                }

                public void onConnectionFailed(ConnectionResult connectionResult) {
/* 3 */             this.zzi = connectionResult.f3416b;
/* 9 */             this.zzj = System.currentTimeMillis();
                }

                public void onConnectionSuspended(int i) {
/* 1 */             this.zzf = i;
/* 7 */             this.zzg = System.currentTimeMillis();
                }

                public void onPostInitHandler(int i, IBinder iBinder, Bundle bundle, int i2) {
/* 3 */             gg3 gg3Var = new gg3(this, i, iBinder, bundle);
/* 6 */             Handler handler = this.zzb;
/* 14 */            handler.sendMessage(handler.obtainMessage(1, i2, -1, gg3Var));
                }

                public void onUserSignOut(InterfaceC0918fi interfaceC0918fi) {
/* 3 */             ((fs0) interfaceC0918fi).m3825v();
                }

                public boolean providesSignIn() {
/* 1 */             return false;
                }

                public boolean requiresAccount() {
/* 1 */             return false;
                }

                public boolean requiresGooglePlayServices() {
/* 1 */             return true;
                }

                public boolean requiresSignIn() {
/* 1 */             return false;
                }

                public void setAttributionSourceWrapper(AbstractC0016ae abstractC0016ae) {
                }

                public void setAttributionTag(String str) {
/* 1 */             this.zzA = str;
                }

                public void triggerConnectionSuspended(int i) {
/* 3 */             int i2 = this.zzd.get();
/* 7 */             Handler handler = this.zzb;
/* 14 */            handler.sendMessage(handler.obtainMessage(6, i2, i));
                }

                public void triggerNotAvailable(InterfaceC0881ei interfaceC0881ei, int i, PendingIntent pendingIntent) {
/* 3 */             kb1.m6062o(interfaceC0881ei, "Connection progress callbacks cannot be null.");
/* 6 */             this.zzc = interfaceC0881ei;
/* 10 */            int i2 = this.zzd.get();
/* 14 */            Handler handler = this.zzb;
/* 21 */            handler.sendMessage(handler.obtainMessage(3, i2, i, pendingIntent));
                }

                public boolean usesClientTelemetry() {
/* 1 */             return false;
                }

                public final String zza() {
/* 1 */             String str = this.zzz;
                    return str == null ? this.zzl.getClass().getName() : str;
                }

                public final void zzb(int i, Bundle bundle, int i2) {
/* 3 */             C0326e c0326e = new C0326e(this, i, bundle);
/* 6 */             Handler handler = this.zzb;
/* 14 */            handler.sendMessage(handler.obtainMessage(7, i2, -1, c0326e));
                }

                public final void zzc(zzj zzjVar) {
/* 1 */             this.zzE = zzjVar;
/* 7 */             if (usesClientTelemetry()) {
/* 9 */                 ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzjVar.f3546d;
/* 11 */                d52 d52VarM2927D = d52.m2927D();
/* 19 */                RootTelemetryConfiguration rootTelemetryConfiguration = connectionTelemetryConfiguration == null ? null : connectionTelemetryConfiguration.f3480a;
                        synchronized (d52VarM2927D) {
                            try {
/* 22 */                        if (rootTelemetryConfiguration == null) {
/* 26 */                            d52VarM2927D.f7001a = d52.f6997c;
/* 29 */                            return;
                                }
/* 34 */                        RootTelemetryConfiguration rootTelemetryConfiguration2 = (RootTelemetryConfiguration) d52VarM2927D.f7001a;
/* 36 */                        if (rootTelemetryConfiguration2 == null || rootTelemetryConfiguration2.f3514a < rootTelemetryConfiguration.f3514a) {
/* 47 */                            d52VarM2927D.f7001a = rootTelemetryConfiguration;
                                }
                            } catch (Throwable th) {
/* 52 */                        throw th;
                            }
                        }
                    }
                }

                public final /* synthetic */ void zzd(int i, IInterface iInterface) {
/* 2 */             m2021a(i, null);
                }

                public final /* synthetic */ boolean zze(int i, int i2, IInterface iInterface) {
                    synchronized (this.zzp) {
                        try {
/* 6 */                     if (this.zzv != i) {
/* 9 */                         return false;
                            }
/* 13 */                    m2021a(i2, iInterface);
/* 17 */                    return true;
                        } catch (Throwable th) {
/* 20 */                    throw th;
                        }
                    }
                }

                public final /* synthetic */ void zzf(int i) {
                    int i2;
                    int i3;
                    synchronized (this.zzp) {
/* 4 */                 i2 = this.zzv;
                    }
/* 8 */             if (i2 == 3) {
/* 11 */                this.zzD = true;
/* 13 */                i3 = 5;
                    } else {
/* 15 */                i3 = 4;
                    }
/* 16 */            Handler handler = this.zzb;
/* 30 */            handler.sendMessage(handler.obtainMessage(i3, this.zzd.get(), 16));
                }

                public final /* synthetic */ boolean zzg() {
/* 4 */             if (this.zzD || TextUtils.isEmpty(getServiceDescriptor()) || TextUtils.isEmpty(getLocalStartServiceAction())) {
/* 3 */                 return false;
                    }
                    try {
/* 33 */                Class.forName(getServiceDescriptor());
/* 36 */                return true;
                    } catch (ClassNotFoundException unused) {
/* 3 */                 return false;
                    }
                }

                public final /* synthetic */ Object zzh() {
/* 1 */             return this.zzq;
                }

                public final /* synthetic */ void zzi(IGmsServiceBroker iGmsServiceBroker) {
/* 1 */             this.zzr = iGmsServiceBroker;
                }

                public final /* synthetic */ ArrayList zzj() {
/* 1 */             return this.zzt;
                }

                public final /* synthetic */ InterfaceC0217ci zzk() {
/* 1 */             return this.zzw;
                }

                public final /* synthetic */ InterfaceC0845di zzl() {
/* 1 */             return this.zzx;
                }

                public final /* synthetic */ ConnectionResult zzm() {
/* 1 */             return this.zzC;
                }

                public final /* synthetic */ void zzn(ConnectionResult connectionResult) {
/* 1 */             this.zzC = connectionResult;
                }

                public final /* synthetic */ boolean zzo() {
/* 1 */             return this.zzD;
                }

/* 54 */        public void disconnect(String str) {
/* 55 */            this.zzk = str;
                    disconnect();
                }
            }
