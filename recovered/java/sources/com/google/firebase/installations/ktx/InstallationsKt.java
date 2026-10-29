            package com.google.firebase.installations.ktx;

            import com.google.firebase.installations.FirebaseInstallations;
            import com.google.firebase.ktx.Firebase;
            import kotlin.Metadata;
            import p000.vi0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0019\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"\u0015\u0010\u0004\u001a\u00020\u0003*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, m6176d2 = {"Lcom/google/firebase/ktx/Firebase;", "Lvi0;", "app", "Lcom/google/firebase/installations/FirebaseInstallations;", "installations", "(Lcom/google/firebase/ktx/Firebase;Lvi0;)Lcom/google/firebase/installations/FirebaseInstallations;", "getInstallations", "(Lcom/google/firebase/ktx/Firebase;)Lcom/google/firebase/installations/FirebaseInstallations;", "com.google.firebase-firebase-installations"}, m6177k = 2, m6178mv = {1, 8, 0}, m6180xi = 48)
            public final class InstallationsKt {
                public static final FirebaseInstallations getInstallations(Firebase firebase) {
/* 1 */             firebase.getClass();
/* 4 */             FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance();
/* 8 */             firebaseInstallations.getClass();
/* 11 */            return firebaseInstallations;
                }

                public static final FirebaseInstallations installations(Firebase firebase, vi0 vi0Var) {
/* 1 */             firebase.getClass();
/* 4 */             vi0Var.getClass();
/* 7 */             FirebaseInstallations firebaseInstallations = FirebaseInstallations.getInstance(vi0Var);
/* 11 */            firebaseInstallations.getClass();
/* 14 */            return firebaseInstallations;
                }
            }
