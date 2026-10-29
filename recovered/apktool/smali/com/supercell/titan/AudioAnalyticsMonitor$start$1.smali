.class public final Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;
.super Landroid/content/BroadcastReceiver;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/supercell/titan/AudioAnalyticsMonitor;->start()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "com/supercell/titan/AudioAnalyticsMonitor$start$1",
        "Landroid/content/BroadcastReceiver;",
        "onReceive",
        "",
        "context",
        "Landroid/content/Context;",
        "intent",
        "Landroid/content/Intent;",
        "titan"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final synthetic a:Lcom/supercell/titan/AudioAnalyticsMonitor;


# direct methods
.method public constructor <init>(Lcom/supercell/titan/AudioAnalyticsMonitor;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;->a:Lcom/supercell/titan/AudioAnalyticsMonitor;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onReceive(Landroid/content/Context;Landroid/content/Intent;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    if-eqz p1, :cond_5

    .line 12
    .line 13
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    const v1, -0x73abbf83

    .line 18
    .line 19
    .line 20
    iget-object p0, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$start$1;->a:Lcom/supercell/titan/AudioAnalyticsMonitor;

    .line 21
    .line 22
    if-eq v0, v1, :cond_3

    .line 23
    .line 24
    const p2, -0x63ecb970

    .line 25
    .line 26
    .line 27
    if-eq v0, p2, :cond_1

    .line 28
    .line 29
    const p2, -0x20bccddb

    .line 30
    .line 31
    .line 32
    if-eq v0, p2, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    const p2, 0x18a

    const-string p2, "android.media.AUDIO_BECOMING_NOISY"

    .line 36
    .line 37
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    if-nez p1, :cond_2

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_1
    const p2, 0x18b

    const-string p2, "android.intent.action.HEADSET_PLUG"

    .line 45
    .line 46
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result p1

    .line 50
    if-nez p1, :cond_2

    .line 51
    .line 52
    goto :goto_0

    .line 53
    :cond_2
    invoke-static {p0}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$buildSnapshot(Lcom/supercell/titan/AudioAnalyticsMonitor;)Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    const/4 p2, 0x0

    .line 58
    invoke-static {p0, p1, p2}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$notifyNative(Lcom/supercell/titan/AudioAnalyticsMonitor;Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;I)V

    .line 59
    .line 60
    .line 61
    return-void

    .line 62
    :cond_3
    const v0, 0x18c

    const-string v0, "android.media.VOLUME_CHANGED_ACTION"

    .line 63
    .line 64
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result p1

    .line 68
    if-eqz p1, :cond_5

    .line 69
    .line 70
    const p1, 0x18d

    const-string p1, "android.media.EXTRA_VOLUME_STREAM_TYPE"

    .line 71
    .line 72
    const/4 v0, -0x1

    .line 73
    invoke-virtual {p2, p1, v0}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    .line 74
    .line 75
    .line 76
    move-result p1

    .line 77
    const/4 p2, 0x3

    .line 78
    if-ne p1, p2, :cond_5

    .line 79
    .line 80
    invoke-static {p0}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$buildSnapshot(Lcom/supercell/titan/AudioAnalyticsMonitor;)Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;

    .line 81
    .line 82
    .line 83
    move-result-object p1

    .line 84
    iget-boolean p2, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muteKnown:Z

    .line 85
    .line 86
    if-eqz p2, :cond_4

    .line 87
    .line 88
    iget-boolean p2, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muted:Z

    .line 89
    .line 90
    invoke-static {p0}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$getLastMuted$p(Lcom/supercell/titan/AudioAnalyticsMonitor;)Z

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    if-eq p2, v0, :cond_4

    .line 95
    .line 96
    iget-boolean p2, p1, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muted:Z

    .line 97
    .line 98
    invoke-static {p0, p2}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$setLastMuted$p(Lcom/supercell/titan/AudioAnalyticsMonitor;Z)V

    .line 99
    .line 100
    .line 101
    const/4 p2, 0x2

    .line 102
    invoke-static {p0, p1, p2}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$notifyNative(Lcom/supercell/titan/AudioAnalyticsMonitor;Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;I)V

    .line 103
    .line 104
    .line 105
    return-void

    .line 106
    :cond_4
    const/4 p2, 0x1

    .line 107
    invoke-static {p0, p1, p2}, Lcom/supercell/titan/AudioAnalyticsMonitor;->access$notifyNative(Lcom/supercell/titan/AudioAnalyticsMonitor;Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;I)V

    .line 108
    .line 109
    .line 110
    :cond_5
    :goto_0
    return-void
.end method
