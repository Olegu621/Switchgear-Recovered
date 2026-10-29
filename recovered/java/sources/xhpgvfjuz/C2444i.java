            package xhpgvfjuz;
            
            /* JADX INFO: renamed from: xhpgvfjuz.i */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            class C2444i extends Thread {
                C2444i() {
                }

                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    String strM9868d = null;
                    for (int i = 0; i < 10 && (C2394a.f19132b < 0 || (strM9868d = C2394a.m9868d()) == null); i++) {
                        try {
                            Thread.sleep(1000L);
                        } catch (Exception unused) {
                        }
                    }
                    C2394a.m9866b(strM9868d);
                }
            }
