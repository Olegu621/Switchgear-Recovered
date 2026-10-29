            package androidx.recyclerview.widget;

            import android.view.View;
            import androidx.core.app.NotificationCompat;
            import io.sentry.android.core.AbstractC1245n0;
            import java.lang.ref.WeakReference;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.WeakHashMap;
            import okio.Segment;
            import p000.C1951n4;
            import p000.e33;
            import p000.fm0;
            
            /* JADX INFO: renamed from: androidx.recyclerview.widget.o */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class AbstractC0137o {

                /* JADX INFO: renamed from: t */
                public static final List f1777t = Collections.EMPTY_LIST;

                /* JADX INFO: renamed from: a */
                public final View f1778a;

                /* JADX INFO: renamed from: b */
                public WeakReference f1779b;

                /* JADX INFO: renamed from: j */
                public int f1787j;

                /* JADX INFO: renamed from: r */
                public RecyclerView f1795r;

                /* JADX INFO: renamed from: s */
                public AbstractC0129g f1796s;

                /* JADX INFO: renamed from: c */
                public int f1780c = -1;

                /* JADX INFO: renamed from: d */
                public int f1781d = -1;

                /* JADX INFO: renamed from: e */
                public long f1782e = -1;

                /* JADX INFO: renamed from: f */
                public int f1783f = -1;

                /* JADX INFO: renamed from: g */
                public int f1784g = -1;

                /* JADX INFO: renamed from: h */
                public AbstractC0137o f1785h = null;

                /* JADX INFO: renamed from: i */
                public AbstractC0137o f1786i = null;

                /* JADX INFO: renamed from: k */
                public final ArrayList f1788k = null;

                /* JADX INFO: renamed from: l */
                public final List f1789l = null;

                /* JADX INFO: renamed from: m */
                public int f1790m = 0;

                /* JADX INFO: renamed from: n */
                public C0134l f1791n = null;

                /* JADX INFO: renamed from: o */
                public boolean f1792o = false;

                /* JADX INFO: renamed from: p */
                public int f1793p = 0;

                /* JADX INFO: renamed from: q */
                public int f1794q = -1;

                public AbstractC0137o(View view) {
/* 37 */            if (view != null) {
/* 39 */                this.f1778a = view;
                    } else {
/* 44 */                C1951n4.m6859j("itemView may not be null");
/* 47 */                throw null;
                    }
                }

                /* JADX INFO: renamed from: a */
                public final void m1017a(int i) {
/* 4 */             this.f1787j = i | this.f1787j;
                }

                /* JADX INFO: renamed from: b */
                public final int m1018b() {
/* 1 */             int i = this.f1784g;
                    return i == -1 ? this.f1780c : i;
                }

                /* JADX INFO: renamed from: c */
                public final List m1019c() {
                    ArrayList arrayList;
                    return ((this.f1787j & Segment.SHARE_MINIMUM) != 0 || (arrayList = this.f1788k) == null || arrayList.size() == 0) ? f1777t : this.f1789l;
                }

                /* JADX INFO: renamed from: d */
                public final boolean m1020d() {
/* 1 */             View view = this.f1778a;
                    return (view.getParent() == null || view.getParent() == this.f1795r) ? false : true;
                }

                /* JADX INFO: renamed from: e */
                public final boolean m1021e() {
                    return (this.f1787j & 1) != 0;
                }

                /* JADX INFO: renamed from: f */
                public final boolean m1022f() {
                    return (this.f1787j & 4) != 0;
                }

                /* JADX INFO: renamed from: g */
                public final boolean m1023g() {
/* 5 */             if ((this.f1787j & 16) != 0) {
/* 19 */                return false;
                    }
/* 7 */             WeakHashMap weakHashMap = e33.f7494a;
                    return !this.f1778a.hasTransientState();
                }

                /* JADX INFO: renamed from: h */
                public final boolean m1024h() {
                    return (this.f1787j & 8) != 0;
                }

                /* JADX INFO: renamed from: i */
                public final boolean m1025i() {
                    return this.f1791n != null;
                }

                /* JADX INFO: renamed from: j */
                public final boolean m1026j() {
                    return (this.f1787j & NotificationCompat.FLAG_LOCAL_ONLY) != 0;
                }

                /* JADX INFO: renamed from: k */
                public final boolean m1027k() {
                    return (this.f1787j & 2) != 0;
                }

                /* JADX INFO: renamed from: l */
                public final void m1028l(int i, boolean z) {
/* 4 */             if (this.f1781d == -1) {
/* 8 */                 this.f1781d = this.f1780c;
                    }
/* 12 */            if (this.f1784g == -1) {
/* 16 */                this.f1784g = this.f1780c;
                    }
/* 18 */            if (z) {
/* 23 */                this.f1784g += i;
                    }
/* 28 */            this.f1780c += i;
/* 30 */            View view = this.f1778a;
/* 36 */            if (view.getLayoutParams() != null) {
/* 45 */                ((RecyclerView.LayoutParams) view.getLayoutParams()).f1683c = true;
                    }
                }

                /* JADX INFO: renamed from: m */
                public final void m1029m() {
/* 2 */             this.f1787j = 0;
/* 5 */             this.f1780c = -1;
/* 7 */             this.f1781d = -1;
/* 11 */            this.f1782e = -1L;
/* 13 */            this.f1784g = -1;
/* 15 */            this.f1790m = 0;
/* 18 */            this.f1785h = null;
/* 20 */            this.f1786i = null;
/* 22 */            ArrayList arrayList = this.f1788k;
/* 24 */            if (arrayList != null) {
/* 26 */                arrayList.clear();
                    }
/* 33 */            this.f1787j &= -1025;
/* 35 */            this.f1793p = 0;
/* 37 */            this.f1794q = -1;
/* 39 */            RecyclerView.m849j(this);
                }

                /* JADX INFO: renamed from: n */
                public final void m1030n(boolean z) {
/* 1 */             int i = this.f1790m;
/* 8 */             int i2 = z ? i - 1 : i + 1;
/* 9 */             this.f1790m = i2;
/* 11 */            if (i2 < 0) {
/* 14 */                this.f1790m = 0;
/* 32 */                AbstractC1245n0.m4876d("View", "isRecyclable decremented below 0: unmatched pair of setIsRecyable() calls for " + this);
/* 35 */                return;
                    }
/* 36 */            if (!z && i2 == 1) {
/* 44 */                this.f1787j |= 16;
                    } else if (z && i2 == 0) {
/* 55 */                this.f1787j &= -17;
                    }
                }

                /* JADX INFO: renamed from: o */
                public final boolean m1031o() {
                    return (this.f1787j & 128) != 0;
                }

                /* JADX INFO: renamed from: p */
                public final boolean m1032p() {
                    return (this.f1787j & 32) != 0;
                }

                public final String toString() {
/* 26 */            StringBuilder sbM3794t = fm0.m3794t(getClass().isAnonymousClass() ? "ViewHolder" : getClass().getSimpleName(), "{");
/* 38 */            sbM3794t.append(Integer.toHexString(hashCode()));
/* 43 */            sbM3794t.append(" position=");
/* 48 */            sbM3794t.append(this.f1780c);
/* 53 */            sbM3794t.append(" id=");
/* 58 */            sbM3794t.append(this.f1782e);
/* 63 */            sbM3794t.append(", oldPos=");
/* 68 */            sbM3794t.append(this.f1781d);
/* 73 */            sbM3794t.append(", pLpos:");
/* 78 */            sbM3794t.append(this.f1784g);
/* 85 */            StringBuilder sb = new StringBuilder(sbM3794t.toString());
/* 92 */            if (m1025i()) {
/* 96 */                sb.append(" scrap ");
/* 108 */               sb.append(this.f1792o ? "[changeScrap]" : "[attachedScrap]");
                    }
/* 115 */           if (m1022f()) {
/* 119 */               sb.append(" invalid");
                    }
/* 126 */           if (!m1021e()) {
/* 130 */               sb.append(" unbound");
                    }
/* 137 */           if ((this.f1787j & 2) != 0) {
/* 141 */               sb.append(" update");
                    }
/* 148 */           if (m1024h()) {
/* 152 */               sb.append(" removed");
                    }
/* 159 */           if (m1031o()) {
/* 163 */               sb.append(" ignored");
                    }
/* 170 */           if (m1026j()) {
/* 174 */               sb.append(" tmpDetached");
                    }
/* 181 */           if (!m1023g()) {
/* 204 */               sb.append(" not recyclable(" + this.f1790m + ")");
                    }
/* 211 */           if ((this.f1787j & NotificationCompat.FLAG_GROUP_SUMMARY) != 0 || m1022f()) {
/* 221 */               sb.append(" undefined adapter position");
                    }
/* 230 */           if (this.f1778a.getParent() == null) {
/* 234 */               sb.append(" no parent");
                    }
/* 239 */           sb.append("}");
/* 242 */           return sb.toString();
                }
            }
