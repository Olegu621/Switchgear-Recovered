            package com.google.firebase.messaging;

            import android.content.Intent;
            import android.os.Bundle;
            import android.text.TextUtils;
            import java.util.ArrayDeque;
            import java.util.Queue;
            import java.util.concurrent.ExecutorService;
            import p000.h52;
            import p000.ra2;
            import p000.ts0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class FirebaseMessagingService extends EnhancedIntentService {
                public static final String ACTION_DIRECT_BOOT_REMOTE_INTENT = "com.google.firebase.messaging.RECEIVE_DIRECT_BOOT";
                static final String ACTION_NEW_TOKEN = "com.google.firebase.messaging.NEW_TOKEN";
                static final String ACTION_REMOTE_INTENT = "com.google.android.c2dm.intent.RECEIVE";
                static final String EXTRA_TOKEN = "token";
                private static final int RECENTLY_RECEIVED_MESSAGE_IDS_MAX_SIZE = 10;
                private static final Queue<String> recentlyReceivedMessageIds = new ArrayDeque(10);
                private h52 rpc;

                public static void resetForTesting() {
/* 3 */             recentlyReceivedMessageIds.clear();
                }

                @Override // com.google.firebase.messaging.EnhancedIntentService
                public Intent getStartCommandIntent(Intent intent) {
/* 13 */            return (Intent) ((ArrayDeque) ra2.m8100l().f15958d).poll();
                }

                /* JADX WARN: Code duplicated, block: B:25:0x005a  */
                /* JADX WARN: Code duplicated, block: B:29:0x0065  */
                /* JADX WARN: Code duplicated, block: B:32:0x006e  */
                /* JADX WARN: Code duplicated, block: B:33:0x0070  */
                /* JADX WARN: Code duplicated, block: B:36:0x0079  */
                /* JADX WARN: Code duplicated, block: B:37:0x007b  */
                /* JADX WARN: Code duplicated, block: B:40:0x0084  */
                /* JADX WARN: Code duplicated, block: B:41:0x0086  */
                /* JADX WARN: Code duplicated, block: B:44:0x008f  */
                /* JADX WARN: Code duplicated, block: B:46:0x0093  */
                /* JADX WARN: Code duplicated, block: B:47:0x00a0  */
                /* JADX WARN: Code duplicated, block: B:48:0x00a9  */
                /* JADX WARN: Code duplicated, block: B:50:0x00af  */
                /* JADX WARN: Code duplicated, block: B:54:0x00c3  */
                /* JADX WARN: Code duplicated, block: B:56:0x00d0  */
                /* JADX WARN: Code duplicated, block: B:58:0x00d9  */
                /* JADX WARN: Code duplicated, block: B:61:0x00e9  */
                /* JADX WARN: Code duplicated, block: B:64:0x0104  */
                /* JADX WARN: Code duplicated, block: B:65:0x0108  */
                /* JADX WARN: Code duplicated, block: B:67:0x0111  */
                /* JADX WARN: Code duplicated, block: B:71:0x0120  */
                /* JADX WARN: Code duplicated, block: B:72:0x0129  */
                @Override // com.google.firebase.messaging.EnhancedIntentService
                public void handleIntent(Intent intent) {
                    String stringExtra;
                    Bundle extras;
                    ts0 ts0Var;
                    ExecutorService executorServiceNewSingleThreadExecutor;
                    String stringExtra2;
                    String stringExtra3;
                    int i;
/* 1 */             String action = intent.getAction();
/* 11 */            if (!ACTION_REMOTE_INTENT.equals(action) && !"com.google.firebase.messaging.RECEIVE_DIRECT_BOOT".equals(action)) {
/* 28 */                if (ACTION_NEW_TOKEN.equals(action)) {
/* 36 */                    onNewToken(intent.getStringExtra(EXTRA_TOKEN));
/* 39 */                    return;
                        } else {
/* 40 */                    intent.getAction();
/* 43 */                    return;
                        }
                    }
/* 46 */            String stringExtra4 = intent.getStringExtra("google.message_id");
/* 56 */            if (TextUtils.isEmpty(stringExtra4)) {
/* 85 */                stringExtra = intent.getStringExtra("message_type");
/* 89 */                if (stringExtra == null) {
/* 91 */                    stringExtra = "gcm";
                        }
                        switch (stringExtra) {
                            case -2062414158:
                                if (stringExtra.equals("deleted_messages")) {
                                }
                                break;
                            case 102161:
                                if (stringExtra.equals("gcm")) {
                                }
                                break;
                            case 814694033:
                                if (stringExtra.equals("send_error")) {
                                }
                                break;
                            case 814800675:
                                if (stringExtra.equals("send_event")) {
                                }
                                break;
                        }
                        /*  JADX ERROR: Method code generation error
                            java.lang.NullPointerException: Switch insn not found in header
                            	at java.base/java.util.Objects.requireNonNull(Unknown Source)
                            	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                            	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(Unknown Source)
                            	at java.base/java.util.ArrayList.forEach(Unknown Source)
                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(Unknown Source)
                            	at java.base/java.util.stream.Sink$ChainedReference.end(Unknown Source)
                            */
                        /*
                            Method dump skipped, instruction units count: 446
                            To view this dump add '--comments-level debug' option
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.messaging.FirebaseMessagingService.handleIntent(android.content.Intent):void");
                    }

                    public void onDeletedMessages() {
                    }

                    public void onMessageReceived(RemoteMessage remoteMessage) {
                    }

                    @Deprecated
                    public void onMessageSent(String str) {
                    }

                    public void onNewToken(String str) {
                    }

                    @Deprecated
                    public void onSendError(String str, Exception exc) {
                    }

                    public void setRpcForTesting(h52 h52Var) {
/* 1 */                 this.rpc = h52Var;
                    }
                }
