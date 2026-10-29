            package com.google.android.gms.internal.location;

            import android.app.PendingIntent;
            import android.location.Location;
            import android.os.Looper;
            import com.google.android.gms.location.LocationAvailability;
            import com.google.android.gms.location.LocationRequest;
            import p000.C0983h9;
            import p000.eb3;
            import p000.kb1;
            import p000.m91;
            import p000.n91;
            import p000.q91;
            import p000.sr1;
            import p000.tr0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 13 */    public final class zzz {
                public final sr1 flushLocations(tr0 tr0Var) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzq(this, tr0Var));
                }

                public final Location getLastLocation(tr0 tr0Var) {
/* 1 */             C0983h9 c0983h9 = q91.f15449a;
/* 10 */            kb1.m6053f("GoogleApiClient parameter is required.", tr0Var != null);
/* 13 */            tr0Var.getClass();
/* 21 */            throw new UnsupportedOperationException();
                }

                public final LocationAvailability getLocationAvailability(tr0 tr0Var) {
/* 1 */             C0983h9 c0983h9 = q91.f15449a;
/* 10 */            kb1.m6053f("GoogleApiClient parameter is required.", tr0Var != null);
/* 13 */            tr0Var.getClass();
/* 21 */            throw new UnsupportedOperationException();
                }

                public final sr1 removeLocationUpdates(tr0 tr0Var, PendingIntent pendingIntent) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzw(this, tr0Var, pendingIntent));
                }

                public final sr1 requestLocationUpdates(tr0 tr0Var, LocationRequest locationRequest, n91 n91Var) {
/* 7 */             kb1.m6062o(Looper.myLooper(), "Calling thread must be a prepared Looper thread.");
/* 19 */            return ((eb3) tr0Var).f7609b.doWrite(new zzr(this, tr0Var, locationRequest, n91Var));
                }

                public final sr1 setMockLocation(tr0 tr0Var, Location location) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzp(this, tr0Var, location));
                }

                public final sr1 setMockMode(tr0 tr0Var, boolean z) {
/* 10 */            return ((eb3) tr0Var).f7609b.doWrite(new zzo(this, tr0Var, z));
                }

/* 14 */        public final sr1 removeLocationUpdates(tr0 tr0Var, m91 m91Var) {
/* 17 */            return ((eb3) tr0Var).f7609b.doWrite(new zzn(this, tr0Var, m91Var));
                }

/* 17 */        public final sr1 removeLocationUpdates(tr0 tr0Var, n91 n91Var) {
/* 20 */            return ((eb3) tr0Var).f7609b.doWrite(new zzv(this, tr0Var, n91Var));
                }

/* 23 */        public final sr1 requestLocationUpdates(tr0 tr0Var, LocationRequest locationRequest, m91 m91Var, Looper looper) {
/* 26 */            return ((eb3) tr0Var).f7609b.doWrite(new zzt(this, tr0Var, locationRequest, m91Var, looper));
                }

/* 26 */        public final sr1 requestLocationUpdates(tr0 tr0Var, LocationRequest locationRequest, PendingIntent pendingIntent) {
/* 29 */            return ((eb3) tr0Var).f7609b.doWrite(new zzu(this, tr0Var, locationRequest, pendingIntent));
                }

/* 29 */        public final sr1 requestLocationUpdates(tr0 tr0Var, LocationRequest locationRequest, n91 n91Var, Looper looper) {
/* 32 */            return ((eb3) tr0Var).f7609b.doWrite(new zzs(this, tr0Var, locationRequest, n91Var, looper));
                }
            }
