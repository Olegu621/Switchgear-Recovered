            package com.supercell.p007id.scid_plugin;

            import android.os.Handler;
            import android.os.Looper;
            import androidx.core.app.NotificationCompat;
            import io.flutter.plugin.common.BinaryMessenger;
            import io.flutter.plugin.common.EventChannel;
            import java.util.Map;
            import kotlin.Metadata;
            import okhttp3.HttpUrl;
            import p000.RunnableC1784j8;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            @Metadata(m6175d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\n\u001a\u00020\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rJ\u001c\u0010\u0010\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0012\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u000fH\u0016R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m6176d2 = {"Lcom/supercell/id/scid_plugin/BarcodeHandler;", "Lio/flutter/plugin/common/EventChannel$StreamHandler;", "binaryMessenger", "Lio/flutter/plugin/common/BinaryMessenger;", "<init>", "(Lio/flutter/plugin/common/BinaryMessenger;)V", "eventSink", "Lio/flutter/plugin/common/EventChannel$EventSink;", "eventChannel", "Lio/flutter/plugin/common/EventChannel;", "publishEvent", HttpUrl.FRAGMENT_ENCODE_SET, NotificationCompat.CATEGORY_EVENT, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "onListen", "onCancel", "scid_plugin_release"}, m6177k = 1, m6178mv = {2, 1, 0}, m6180xi = 48)
            public final class BarcodeHandler implements EventChannel.StreamHandler {
                private final EventChannel eventChannel;
                private EventChannel.EventSink eventSink;

                public BarcodeHandler(BinaryMessenger binaryMessenger) {
/* 1 */             binaryMessenger.getClass();
/* 11 */            EventChannel eventChannel = new EventChannel(binaryMessenger, "com.supercell.id.ScidPlugin.mobile_scanner/event");
/* 14 */            this.eventChannel = eventChannel;
/* 16 */            eventChannel.setStreamHandler(this);
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final void publishEvent$lambda$0(BarcodeHandler barcodeHandler, Map map) {
/* 1 */             EventChannel.EventSink eventSink = barcodeHandler.eventSink;
/* 3 */             if (eventSink != null) {
/* 5 */                 eventSink.success(map);
                    }
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public void onCancel(Object event) {
/* 2 */             this.eventSink = null;
                }

                @Override // io.flutter.plugin.common.EventChannel.StreamHandler
                public void onListen(Object event, EventChannel.EventSink eventSink) {
/* 1 */             this.eventSink = eventSink;
                }

                public final void publishEvent(Map<String, ? extends Object> event) {
/* 1 */             event.getClass();
/* 19 */            new Handler(Looper.getMainLooper()).post(new RunnableC1784j8(3, this, event));
                }
            }
