            package com.quago.mobile.sdk;

            import android.content.Context;
            import java.util.LinkedList;
            
            /* JADX INFO: renamed from: com.quago.mobile.sdk.p0 */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 52 */    public final class C0754p0 {

                /* JADX INFO: renamed from: a */
                public final C0722d0 f5607a;

                /* JADX INFO: renamed from: b */
                public final C0723d1 f5608b;

                /* JADX INFO: renamed from: c */
                public final C0773z0 f5609c;

                /* JADX INFO: renamed from: d */
                public final C0734h0 f5610d;

                /* JADX INFO: renamed from: e */
                public final LinkedList f5611e;

                /* JADX INFO: renamed from: f */
                public final LinkedList f5612f;

                /* JADX INFO: renamed from: g */
                public final LinkedList f5613g;

                public C0754p0(Context context) {
/* 9 */             this.f5607a = new C0722d0();
/* 16 */            this.f5608b = new C0723d1();
/* 23 */            this.f5609c = new C0773z0(context);
/* 30 */            this.f5610d = new C0734h0();
/* 37 */            this.f5611e = new LinkedList();
/* 44 */            this.f5612f = new LinkedList();
/* 51 */            this.f5613g = new LinkedList();
                }

                public final String toString() {
/* 48 */            return "QuagoMetaInformation{build=" + this.f5607a + ", version=" + this.f5608b + ", security=" + this.f5609c + ", emulation=" + this.f5610d + '}';
                }

/* 53 */        public C0754p0(C0754p0 c0754p0, LinkedList linkedList, LinkedList linkedList2, LinkedList linkedList3) {
/* 55 */            this.f5607a = c0754p0.f5607a;
/* 56 */            this.f5608b = c0754p0.f5608b;
/* 57 */            this.f5609c = c0754p0.f5609c;
/* 58 */            this.f5610d = c0754p0.f5610d;
/* 59 */            this.f5611e = linkedList;
/* 60 */            this.f5612f = linkedList2;
/* 61 */            this.f5613g = linkedList3;
                }
            }
