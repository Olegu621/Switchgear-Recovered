            package p000;

            import android.content.Context;
            import android.os.DeadObjectException;
            import android.os.Handler;
            import android.os.Looper;
            import android.os.Message;
            import android.os.RemoteException;
            import android.util.SparseIntArray;
            import com.google.android.gms.common.ConnectionResult;
            import com.google.android.gms.common.Feature;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.common.api.internal.zact;
            import com.google.android.gms.common.internal.AbstractC0322a;
            import com.google.android.gms.internal.base.zau;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.sentry.C1697u2;
            import io.sentry.android.core.AbstractC1245n0;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            import java.util.Iterator;
            import java.util.LinkedList;
            import java.util.Map;
            import java.util.Set;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class cb3 implements rr0, sr0 {

                /* JADX INFO: renamed from: b */
                public final InterfaceC0836d9 f2821b;

                /* JADX INFO: renamed from: c */
                public final C2323w9 f2822c;

                /* JADX INFO: renamed from: d */
                public final we2 f2823d;

                /* JADX INFO: renamed from: i */
                public final int f2826i;

                /* JADX INFO: renamed from: j */
                public final zact f2827j;

                /* JADX INFO: renamed from: k */
                public boolean f2828k;

                /* JADX INFO: renamed from: o */
                public final /* synthetic */ ur0 f2832o;

                /* JADX INFO: renamed from: a */
                public final LinkedList f2820a = new LinkedList();

                /* JADX INFO: renamed from: e */
                public final HashSet f2824e = new HashSet();

                /* JADX INFO: renamed from: f */
                public final HashMap f2825f = new HashMap();

                /* JADX INFO: renamed from: l */
                public final ArrayList f2829l = new ArrayList();

                /* JADX INFO: renamed from: m */
                public ConnectionResult f2830m = null;

                /* JADX INFO: renamed from: n */
                public int f2831n = 0;

                public cb3(ur0 ur0Var, or0 or0Var) {
/* 4 */             this.f2832o = ur0Var;
/* 40 */            zau zauVar = ur0Var.f17695n;
/* 46 */            InterfaceC0836d9 interfaceC0836d9Zab = or0Var.zab(zauVar.getLooper(), this);
/* 50 */            this.f2821b = interfaceC0836d9Zab;
/* 56 */            this.f2822c = or0Var.getApiKey();
/* 65 */            this.f2823d = new we2(16);
/* 71 */            this.f2826i = or0Var.zaa();
/* 77 */            if (interfaceC0836d9Zab.requiresSignIn()) {
/* 85 */                this.f2827j = or0Var.zac(ur0Var.f17686e, zauVar);
                    } else {
/* 88 */                this.f2827j = null;
                    }
                }

                @Override // p000.InterfaceC2478xy
                /* JADX INFO: renamed from: a */
                public final void mo1610a(int i) {
/* 1 */             Looper looperMyLooper = Looper.myLooper();
/* 7 */             zau zauVar = this.f2832o.f17695n;
/* 13 */            if (looperMyLooper == zauVar.getLooper()) {
/* 15 */                m1618i(i);
                    } else {
/* 25 */                zauVar.post(new RunnableC2503ym(this, i, 5));
                    }
                }

                @Override // p000.wp1
                /* JADX INFO: renamed from: b */
                public final void mo1611b(ConnectionResult connectionResult) {
/* 2 */             m1625p(connectionResult, null);
                }

                /* JADX INFO: renamed from: c */
                public final Feature m1612c(Feature[] featureArr) {
/* 2 */             if (featureArr != null && featureArr.length != 0) {
/* 10 */                Feature[] availableFeatures = this.f2821b.getAvailableFeatures();
/* 15 */                if (availableFeatures == null) {
/* 17 */                    availableFeatures = new Feature[0];
                        }
/* 22 */                C1024id c1024id = new C1024id(availableFeatures.length);
/* 27 */                for (Feature feature : availableFeatures) {
/* 41 */                    c1024id.put(feature.f3420a, Long.valueOf(feature.m2004D1()));
                        }
/* 48 */                for (Feature feature2 : featureArr) {
/* 58 */                    Long l = (Long) c1024id.getOrDefault(feature2.f3420a, null);
/* 60 */                    if (l == null || l.longValue() < feature2.m2004D1()) {
/* 78 */                        return feature2;
                            }
                        }
                    }
/* 1 */             return null;
                }

                /* JADX INFO: renamed from: d */
                public final void m1613d(ConnectionResult connectionResult) {
/* 1 */             HashSet hashSet = this.f2824e;
/* 3 */             Iterator it = hashSet.iterator();
/* 11 */            if (!it.hasNext()) {
/* 38 */                hashSet.clear();
                    } else if (it.next() != null) {
/* 34 */                C1697u2.m5431g();
                    } else {
/* 25 */                if (de3.m3029k(connectionResult, ConnectionResult.f3414f)) {
/* 29 */                    this.f2821b.getEndpointPackageName();
                        }
/* 33 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: e */
                public final void m1614e(Status status) {
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 10 */            m1615f(status, null, false);
                }

                /* JADX INFO: renamed from: f */
                public final void m1615f(Status status, Exception exc, boolean z) {
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 18 */            if ((status == null) == (exc == null)) {
/* 61 */                C1951n4.m6859j("Status XOR exception should be null");
/* 64 */                return;
                    }
/* 22 */            Iterator it = this.f2820a.iterator();
/* 30 */            while (it.hasNext()) {
/* 36 */                bc3 bc3Var = (bc3) it.next();
/* 38 */                if (!z || bc3Var.f2369a == 2) {
/* 45 */                    if (status != null) {
/* 47 */                        bc3Var.mo1333a(status);
                            } else {
/* 51 */                        bc3Var.mo1334b(exc);
                            }
/* 54 */                    it.remove();
                        }
                    }
                }

                /* JADX INFO: renamed from: g */
                public final void m1616g() {
/* 3 */             LinkedList linkedList = this.f2820a;
/* 5 */             ArrayList arrayList = new ArrayList(linkedList);
/* 8 */             int size = arrayList.size();
/* 13 */            for (int i = 0; i < size; i++) {
/* 19 */                bc3 bc3Var = (bc3) arrayList.get(i);
/* 27 */                if (!this.f2821b.isConnected()) {
/* 42 */                    return;
                        }
/* 34 */                if (m1620k(bc3Var)) {
/* 36 */                    linkedList.remove(bc3Var);
                        }
                    }
                }

                /* JADX INFO: renamed from: h */
                public final void m1617h() {
/* 1 */             InterfaceC0836d9 interfaceC0836d9 = this.f2821b;
/* 3 */             ur0 ur0Var = this.f2832o;
/* 7 */             kb1.m6055h(ur0Var.f17695n);
/* 11 */            this.f2830m = null;
/* 15 */            m1613d(ConnectionResult.f3414f);
/* 18 */            zau zauVar = ur0Var.f17695n;
/* 22 */            if (this.f2828k) {
/* 26 */                C2323w9 c2323w9 = this.f2822c;
/* 28 */                zauVar.removeMessages(11, c2323w9);
/* 33 */                zauVar.removeMessages(9, c2323w9);
/* 37 */                this.f2828k = false;
                    }
/* 45 */            Iterator it = this.f2825f.values().iterator();
/* 53 */            while (it.hasNext()) {
/* 59 */                lb3 lb3Var = (lb3) it.next();
/* 71 */                if (m1612c(lb3Var.f13173a.getRequiredFeatures()) != null) {
/* 73 */                    it.remove();
                        } else {
                            try {
/* 84 */                        lb3Var.f13173a.registerListener(interfaceC0836d9, new TaskCompletionSource());
                            } catch (DeadObjectException unused) {
/* 93 */                        mo1610a(3);
/* 98 */                        interfaceC0836d9.disconnect("DeadObjectException thrown while calling register listener method.");
                            } catch (RemoteException unused2) {
/* 88 */                        it.remove();
                            }
                        }
                    }
/* 101 */           m1616g();
/* 104 */           m1619j();
                }

                /* JADX INFO: renamed from: i */
                public final void m1618i(int i) {
/* 1 */             ur0 ur0Var = this.f2832o;
/* 3 */             zau zauVar = ur0Var.f17695n;
/* 7 */             kb1.m6055h(ur0Var.f17695n);
/* 11 */            this.f2830m = null;
/* 14 */            this.f2828k = true;
/* 18 */            String lastDisconnectMessage = this.f2821b.getLastDisconnectMessage();
/* 22 */            we2 we2Var = this.f2823d;
/* 24 */            we2Var.getClass();
/* 31 */            StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
/* 34 */            if (i == 1) {
/* 38 */                sb.append(" due to service disconnection.");
                    } else if (i == 3) {
/* 47 */                sb.append(" due to dead object exception.");
                    }
/* 50 */            if (lastDisconnectMessage != null) {
/* 54 */                sb.append(" Last reason for disconnect: ");
/* 57 */                sb.append(lastDisconnectMessage);
                    }
/* 71 */            we2Var.m9567r(new Status(20, sb.toString(), null, null), true);
/* 76 */            C2323w9 c2323w9 = this.f2822c;
/* 84 */            zauVar.sendMessageDelayed(Message.obtain(zauVar, 9, c2323w9), 5000L);
/* 96 */            zauVar.sendMessageDelayed(Message.obtain(zauVar, 11, c2323w9), 120000L);
/* 105 */           ((SparseIntArray) ur0Var.f17688g.f18596c).clear();
/* 114 */           Iterator it = this.f2825f.values().iterator();
/* 122 */           while (it.hasNext()) {
/* 130 */               ((lb3) it.next()).getClass();
                    }
                }

                /* JADX INFO: renamed from: j */
                public final void m1619j() {
/* 1 */             ur0 ur0Var = this.f2832o;
/* 3 */             zau zauVar = ur0Var.f17695n;
/* 7 */             C2323w9 c2323w9 = this.f2822c;
/* 9 */             zauVar.removeMessages(12, c2323w9);
/* 18 */            zauVar.sendMessageDelayed(zauVar.obtainMessage(12, c2323w9), ur0Var.f17682a);
                }

                /* JADX INFO: renamed from: k */
                public final boolean m1620k(bc3 bc3Var) {
/* 6 */             if (!(bc3Var instanceof gb3)) {
/* 8 */                 we2 we2Var = this.f2823d;
/* 10 */                InterfaceC0836d9 interfaceC0836d9 = this.f2821b;
/* 16 */                bc3Var.mo1336d(we2Var, interfaceC0836d9.requiresSignIn());
                        try {
/* 19 */                    bc3Var.mo1335c(this);
/* 5 */                     return true;
                        } catch (DeadObjectException unused) {
/* 23 */                    mo1610a(1);
/* 26 */                    interfaceC0836d9.disconnect("DeadObjectException thrown while running ApiCallRunner.");
/* 5 */                     return true;
                        }
                    }
/* 31 */            gb3 gb3Var = (gb3) bc3Var;
/* 37 */            Feature featureM1612c = m1612c(gb3Var.mo3908g(this));
/* 41 */            if (featureM1612c == null) {
/* 43 */                we2 we2Var2 = this.f2823d;
/* 45 */                InterfaceC0836d9 interfaceC0836d10 = this.f2821b;
/* 51 */                bc3Var.mo1336d(we2Var2, interfaceC0836d10.requiresSignIn());
                        try {
/* 54 */                    bc3Var.mo1335c(this);
/* 5 */                     return true;
                        } catch (DeadObjectException unused2) {
/* 58 */                    mo1610a(1);
/* 61 */                    interfaceC0836d10.disconnect("DeadObjectException thrown while running ApiCallRunner.");
/* 5 */                     return true;
                        }
                    }
/* 116 */           AbstractC1245n0.m4889q("GoogleApiManager", this.f2821b.getClass().getName() + " could not execute call because it requires feature (" + featureM1612c.f3420a + ", " + featureM1612c.m2004D1() + ").");
/* 123 */           if (!this.f2832o.f17696o || !gb3Var.mo3907f(this)) {
/* 234 */               gb3Var.mo1334b(new oy2(featureM1612c));
/* 5 */                 return true;
                    }
/* 135 */           db3 db3Var = new db3(this.f2822c, featureM1612c);
/* 140 */           int iIndexOf = this.f2829l.indexOf(db3Var);
/* 144 */           ArrayList arrayList = this.f2829l;
/* 150 */           if (iIndexOf >= 0) {
/* 156 */               db3 db3Var2 = (db3) arrayList.get(iIndexOf);
/* 162 */               this.f2832o.f17695n.removeMessages(15, db3Var2);
/* 167 */               zau zauVar = this.f2832o.f17695n;
/* 173 */               zauVar.sendMessageDelayed(Message.obtain(zauVar, 15, db3Var2), 5000L);
/* 227 */               return false;
                    }
/* 177 */           arrayList.add(db3Var);
/* 182 */           zau zauVar2 = this.f2832o.f17695n;
/* 188 */           zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 15, db3Var), 5000L);
/* 193 */           zau zauVar3 = this.f2832o.f17695n;
/* 204 */           zauVar3.sendMessageDelayed(Message.obtain(zauVar3, 16, db3Var), 120000L);
/* 211 */           ConnectionResult connectionResult = new ConnectionResult(2, null, null);
/* 218 */           if (m1621l(connectionResult)) {
/* 227 */               return false;
                    }
/* 224 */           this.f2832o.m9128d(connectionResult, this.f2826i);
/* 227 */           return false;
                }

                /* JADX INFO: renamed from: l */
                public final boolean m1621l(ConnectionResult connectionResult) {
                    AtomicReference atomicReference;
                    synchronized (ur0.f17680r) {
                        try {
/* 4 */                     ur0 ur0Var = this.f2832o;
/* 8 */                     boolean z = false;
/* 9 */                     if (ur0Var.f17692k == null || !ur0Var.f17693l.contains(this.f2822c)) {
/* 8 */                         return false;
                            }
/* 23 */                    ya3 ya3Var = this.f2832o.f17692k;
/* 25 */                    int i = this.f2826i;
/* 27 */                    ya3Var.getClass();
/* 32 */                    dc3 dc3Var = new dc3(connectionResult, i);
/* 66 */                    loop0: do {
/* 35 */                        atomicReference = ya3Var.f19557b;
/* 60 */                        do {
/* 42 */                            int i2 = 1;
/* 43 */                            if (atomicReference.compareAndSet(null, dc3Var)) {
/* 52 */                                ya3Var.f19558c.post(new cp0(ya3Var, dc3Var, i2, z));
                                        break loop0;
                                    }
/* 60 */                        } while (atomicReference.get() == null);
/* 66 */                    } while (atomicReference.get() == null);
/* 42 */                    return true;
                        } catch (Throwable th) {
/* 75 */                    throw th;
                        }
                    }
                }

                /* JADX INFO: renamed from: m */
                public final boolean m1622m(boolean z) {
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 8 */             InterfaceC0836d9 interfaceC0836d9 = this.f2821b;
/* 14 */            if (!interfaceC0836d9.isConnected() || !this.f2825f.isEmpty()) {
/* 59 */                return false;
                    }
/* 24 */            we2 we2Var = this.f2823d;
/* 34 */            if (((Map) we2Var.f18596c).isEmpty() && ((Map) we2Var.f18595b).isEmpty()) {
/* 49 */                interfaceC0836d9.disconnect("Timing out service connection.");
/* 52 */                return true;
                    }
/* 54 */            if (!z) {
/* 59 */                return false;
                    }
/* 56 */            m1619j();
/* 59 */            return false;
                }

                /* JADX INFO: renamed from: n */
                public final void m1623n() {
/* 1 */             ur0 ur0Var = this.f2832o;
/* 5 */             kb1.m6055h(ur0Var.f17695n);
/* 8 */             InterfaceC0836d9 interfaceC0836d9 = this.f2821b;
/* 14 */            if (interfaceC0836d9.isConnected() || interfaceC0836d9.isConnecting()) {
/* 272 */               return;
                    }
                    try {
/* 27 */                we2 we2Var = ur0Var.f17688g;
/* 29 */                Context context = ur0Var.f17686e;
/* 33 */                SparseIntArray sparseIntArray = (SparseIntArray) we2Var.f18596c;
/* 35 */                kb1.m6061n(context);
/* 42 */                int iM8004c = 0;
/* 43 */                if (interfaceC0836d9.requiresGooglePlayServices()) {
/* 46 */                    int minApkVersion = interfaceC0836d9.getMinApkVersion();
/* 55 */                    int i = ((SparseIntArray) we2Var.f18596c).get(minApkVersion, -1);
/* 59 */                    if (i != -1) {
/* 61 */                        iM8004c = i;
                            } else {
/* 63 */                        int i2 = 0;
                                while (true) {
/* 68 */                            if (i2 >= sparseIntArray.size()) {
/* 86 */                                iM8004c = -1;
                                        break;
                                    }
/* 70 */                            int iKeyAt = sparseIntArray.keyAt(i2);
/* 74 */                            if (iKeyAt > minApkVersion && sparseIntArray.get(iKeyAt) == 0) {
                                        break;
                                    } else {
/* 83 */                                i2++;
                                    }
                                }
/* 87 */                        if (iM8004c == -1) {
/* 93 */                            iM8004c = ((pr0) we2Var.f18595b).m8004c(context, minApkVersion);
                                }
/* 98 */                        sparseIntArray.put(minApkVersion, iM8004c);
                            }
                        }
/* 101 */               if (iM8004c != 0) {
/* 105 */                   ConnectionResult connectionResult = new ConnectionResult(iM8004c, null, null);
/* 147 */                   AbstractC1245n0.m4889q("GoogleApiManager", "The service for " + interfaceC0836d9.getClass().getName() + " is not available: " + connectionResult.toString());
/* 150 */                   m1625p(connectionResult, null);
/* 153 */                   return;
                        }
/* 160 */               u93 u93Var = new u93(ur0Var, interfaceC0836d9, this.f2822c);
/* 167 */               if (interfaceC0836d9.requiresSignIn()) {
/* 169 */                   zact zactVar = this.f2827j;
/* 171 */                   kb1.m6061n(zactVar);
/* 174 */                   Handler handler = zactVar.f3454b;
/* 176 */                   C2345wv c2345wv = zactVar.f3457e;
/* 178 */                   ie2 ie2Var = zactVar.f3458f;
/* 180 */                   if (ie2Var != null) {
/* 182 */                       ie2Var.disconnect();
                            }
/* 193 */                   c2345wv.f18830h = Integer.valueOf(System.identityHashCode(zactVar));
/* 212 */                   zactVar.f3458f = (ie2) zactVar.f3455c.buildClient(zactVar.f3453a, handler.getLooper(), c2345wv, (Object) c2345wv.f18829g, (rr0) zactVar, (sr0) zactVar);
/* 214 */                   zactVar.f3459i = u93Var;
/* 216 */                   Set set = zactVar.f3456d;
/* 218 */                   if (set == null || set.isEmpty()) {
/* 247 */                       handler.post(new bb3(zactVar, 2));
                            } else {
/* 227 */                       ie2 ie2Var2 = zactVar.f3458f;
/* 229 */                       ie2Var2.getClass();
/* 237 */                       ie2Var2.connect(new gr0((AbstractC0322a) ie2Var2));
                            }
                        }
                        try {
/* 250 */                   interfaceC0836d9.connect(u93Var);
                        } catch (SecurityException e) {
/* 260 */                   m1625p(new ConnectionResult(10, null, null), e);
                        }
                    } catch (IllegalStateException e2) {
/* 269 */               m1625p(new ConnectionResult(10, null, null), e2);
                    }
                }

                /* JADX INFO: renamed from: o */
                public final void m1624o(bc3 bc3Var) {
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 10 */            boolean zIsConnected = this.f2821b.isConnected();
/* 14 */            LinkedList linkedList = this.f2820a;
/* 16 */            if (zIsConnected) {
/* 22 */                if (m1620k(bc3Var)) {
/* 24 */                    m1619j();
/* 27 */                    return;
                        } else {
/* 28 */                    linkedList.add(bc3Var);
/* 31 */                    return;
                        }
                    }
/* 32 */            linkedList.add(bc3Var);
/* 35 */            ConnectionResult connectionResult = this.f2830m;
/* 37 */            if (connectionResult == null || connectionResult.f3416b == 0 || connectionResult.f3417c == null) {
/* 52 */                m1623n();
                    } else {
/* 48 */                m1625p(connectionResult, null);
                    }
                }

                @Override // p000.InterfaceC2478xy
                public final void onConnected() {
/* 1 */             Looper looperMyLooper = Looper.myLooper();
/* 7 */             zau zauVar = this.f2832o.f17695n;
/* 13 */            if (looperMyLooper == zauVar.getLooper()) {
/* 15 */                m1617h();
                    } else {
/* 25 */                zauVar.post(new bb3(this, 0));
                    }
                }

                /* JADX INFO: renamed from: p */
                public final void m1625p(ConnectionResult connectionResult, RuntimeException runtimeException) {
                    ie2 ie2Var;
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 8 */             zact zactVar = this.f2827j;
/* 10 */            if (zactVar != null && (ie2Var = zactVar.f3458f) != null) {
/* 16 */                ie2Var.disconnect();
                    }
/* 23 */            kb1.m6055h(this.f2832o.f17695n);
/* 27 */            this.f2830m = null;
/* 37 */            ((SparseIntArray) this.f2832o.f17688g.f18596c).clear();
/* 40 */            m1613d(connectionResult);
/* 48 */            if ((this.f2821b instanceof gc3) && connectionResult.f3416b != 24) {
/* 56 */                ur0 ur0Var = this.f2832o;
/* 58 */                ur0Var.f17683b = true;
/* 60 */                zau zauVar = ur0Var.f17695n;
/* 71 */                zauVar.sendMessageDelayed(zauVar.obtainMessage(19), 300000L);
                    }
/* 77 */            if (connectionResult.f3416b == 4) {
/* 81 */                m1614e(ur0.f17679q);
/* 84 */                return;
                    }
/* 91 */            if (this.f2820a.isEmpty()) {
/* 93 */                this.f2830m = connectionResult;
/* 95 */                return;
                    }
/* 96 */            ur0 ur0Var2 = this.f2832o;
/* 98 */            if (runtimeException != null) {
/* 102 */               kb1.m6055h(ur0Var2.f17695n);
/* 106 */               m1615f(null, runtimeException, false);
/* 109 */               return;
                    }
/* 110 */           boolean z = ur0Var2.f17696o;
/* 112 */           C2323w9 c2323w9 = this.f2822c;
/* 114 */           if (!z) {
/* 192 */               m1614e(ur0.m9124e(c2323w9, connectionResult));
/* 195 */               return;
                    }
/* 120 */           m1615f(ur0.m9124e(c2323w9, connectionResult), null, true);
/* 129 */           if (this.f2820a.isEmpty() || m1621l(connectionResult) || this.f2832o.m9128d(connectionResult, this.f2826i)) {
/* 187 */               return;
                    }
/* 152 */           if (connectionResult.f3416b == 18) {
/* 154 */               this.f2828k = true;
                    }
/* 158 */           if (!this.f2828k) {
/* 184 */               m1614e(ur0.m9124e(this.f2822c, connectionResult));
/* 187 */               return;
                    }
/* 160 */           ur0 ur0Var3 = this.f2832o;
/* 162 */           C2323w9 c2323w10 = this.f2822c;
/* 164 */           zau zauVar2 = ur0Var3.f17695n;
/* 174 */           zauVar2.sendMessageDelayed(Message.obtain(zauVar2, 9, c2323w10), 5000L);
                }

                /* JADX INFO: renamed from: q */
                public final void m1626q(ConnectionResult connectionResult) {
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 8 */             InterfaceC0836d9 interfaceC0836d9 = this.f2821b;
/* 44 */            interfaceC0836d9.disconnect("onSignInFailed for " + interfaceC0836d9.getClass().getName() + " with " + String.valueOf(connectionResult));
/* 48 */            m1625p(connectionResult, null);
                }

                /* JADX INFO: renamed from: r */
                public final void m1627r() {
/* 5 */             kb1.m6055h(this.f2832o.f17695n);
/* 8 */             Status status = ur0.f17678p;
/* 10 */            m1614e(status);
/* 16 */            this.f2823d.m9567r(status, false);
/* 34 */            for (t81 t81Var : (t81[]) this.f2825f.keySet().toArray(new t81[0])) {
/* 48 */                m1624o(new wb3(t81Var, new TaskCompletionSource()));
                    }
/* 61 */            m1613d(new ConnectionResult(4, null, null));
/* 64 */            InterfaceC0836d9 interfaceC0836d9 = this.f2821b;
/* 70 */            if (interfaceC0836d9.isConnected()) {
/* 79 */                interfaceC0836d9.onUserSignOut(new fs0(this, 25));
                    }
                }
            }
