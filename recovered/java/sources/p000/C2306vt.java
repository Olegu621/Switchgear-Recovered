            package p000;

            import android.hardware.camera2.CaptureRequest;
            import android.hardware.camera2.TotalCaptureResult;
            import android.view.View;
            import android.view.ViewGroup;
            import com.google.android.material.chip.Chip;
            import com.google.android.material.chip.ChipGroup;
            import java.util.ArrayList;
            import java.util.HashMap;
            import java.util.HashSet;
            
            /* JADX INFO: renamed from: vt */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 34 */    public final class C2306vt {

                /* JADX INFO: renamed from: a */
                public boolean f18348a;

                /* JADX INFO: renamed from: b */
                public boolean f18349b;

                /* JADX INFO: renamed from: c */
                public final Object f18350c;

                /* JADX INFO: renamed from: d */
                public final Object f18351d;

                /* JADX INFO: renamed from: e */
                public Object f18352e;

                public C2306vt(C1799jn c1799jn, C0962gp c0962gp, y92 y92Var) {
/* 4 */             this.f18350c = c1799jn;
/* 12 */            xe2.m9787y(new C2357x6(c0962gp, 2));
/* 25 */            this.f18351d = new rk1(0);
/* 32 */            c1799jn.m5855h(new InterfaceC1033in() { // from class: lq2
                        @Override // p000.InterfaceC1033in
                        /* JADX INFO: renamed from: a */
                        public final boolean mo3157a(TotalCaptureResult totalCaptureResult) {
/* 1 */                     C2306vt c2306vt = this.f13456a;
/* 8 */                     if (((C2260um) c2306vt.f18352e) != null) {
/* 20 */                        Integer num = (Integer) totalCaptureResult.getRequest().get(CaptureRequest.FLASH_MODE);
/* 36 */                        if ((num != null && num.intValue() == 2) == c2306vt.f18349b) {
/* 43 */                            ((C2260um) c2306vt.f18352e).m9040a(null);
/* 46 */                            c2306vt.f18352e = null;
                                }
                            }
/* 7 */                     return false;
                        }
                    });
                }

                /* JADX INFO: renamed from: a */
                public boolean m9341a(Chip chip) {
/* 1 */             int id = chip.getId();
/* 7 */             HashSet hashSet = (HashSet) this.f18351d;
/* 18 */            if (hashSet.contains(Integer.valueOf(id))) {
/* 17 */                return false;
                    }
/* 37 */            Chip chip2 = (Chip) ((HashMap) this.f18350c).get(Integer.valueOf(m9343c()));
/* 39 */            if (chip2 != null) {
/* 41 */                m9345e(chip2, false);
                    }
/* 48 */            boolean zAdd = hashSet.add(Integer.valueOf(id));
/* 56 */            if (!chip.isChecked()) {
/* 59 */                chip.setChecked(true);
                    }
/* 62 */            return zAdd;
                }

                /* JADX INFO: renamed from: b */
                public ArrayList m9342b(ViewGroup viewGroup) {
/* 7 */             HashSet hashSet = new HashSet((HashSet) this.f18351d);
/* 12 */            ArrayList arrayList = new ArrayList();
/* 20 */            for (int i = 0; i < viewGroup.getChildCount(); i++) {
/* 22 */                View childAt = viewGroup.getChildAt(i);
/* 28 */                if ((childAt instanceof Chip) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
/* 52 */                    arrayList.add(Integer.valueOf(childAt.getId()));
                        }
                    }
/* 58 */            return arrayList;
                }

                /* JADX INFO: renamed from: c */
                public int m9343c() {
/* 3 */             HashSet hashSet = (HashSet) this.f18351d;
/* 7 */             if (!this.f18348a || hashSet.isEmpty()) {
/* 30 */                return -1;
                    }
/* 25 */            return ((Integer) hashSet.iterator().next()).intValue();
                }

                /* JADX INFO: renamed from: d */
                public void m9344d() {
/* 3 */             gr0 gr0Var = (gr0) this.f18352e;
/* 5 */             if (gr0Var != null) {
/* 13 */                new HashSet((HashSet) this.f18351d);
/* 18 */                ChipGroup chipGroup = (ChipGroup) gr0Var.f8789a;
/* 20 */                InterfaceC1806ju interfaceC1806ju = chipGroup.f4603i;
/* 22 */                if (interfaceC1806ju != null) {
/* 26 */                    chipGroup.f4604v.m9342b(chipGroup);
/* 33 */                    ChipGroup chipGroup2 = (ChipGroup) ((qc3) interfaceC1806ju).f15492b;
/* 39 */                    if (chipGroup2.f4604v.f18348a) {
/* 42 */                        chipGroup2.getCheckedChipId();
/* 46 */                        throw null;
                            }
                        }
                    }
                }

                /* JADX INFO: renamed from: e */
                public boolean m9345e(Chip chip, boolean z) {
/* 1 */             int id = chip.getId();
/* 7 */             HashSet hashSet = (HashSet) this.f18351d;
/* 18 */            if (!hashSet.contains(Integer.valueOf(id))) {
/* 17 */                return false;
                    }
/* 21 */            if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
/* 40 */                chip.setChecked(true);
/* 17 */                return false;
                    }
/* 48 */            boolean zRemove = hashSet.remove(Integer.valueOf(id));
/* 56 */            if (chip.isChecked()) {
/* 58 */                chip.setChecked(false);
                    }
/* 61 */            return zRemove;
                }

/* 35 */        public C2306vt() {
/* 37 */            this.f18350c = new HashMap();
/* 38 */            this.f18351d = new HashSet();
                }
            }
