.class public final Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/supercell/titan/AudioAnalyticsMonitor;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Snapshot"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0006\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000c\u001a\u00020\u0008\u0012\u0006\u0010\r\u001a\u00020\u000e\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0018\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\n8\u0006X\u0087\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0013R\u0010\u0010\u000c\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"
    }
    d2 = {
        "Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;",
        "",
        "volume",
        "",
        "muted",
        "",
        "muteKnown",
        "outputRoutes",
        "",
        "outputDeviceNames",
        "",
        "",
        "outputChannelCounts",
        "sampleRate",
        "",
        "bufferSize",
        "otherMediaIsPlaying",
        "<init>",
        "(FZZ[I[Ljava/lang/String;[IIIZ)V",
        "[Ljava/lang/String;",
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
.field public final bufferSize:I

.field public final muteKnown:Z

.field public final muted:Z

.field public final otherMediaIsPlaying:Z

.field public final outputChannelCounts:[I

.field public final outputDeviceNames:[Ljava/lang/String;

.field public final outputRoutes:[I

.field public final sampleRate:I

.field public final volume:F


# direct methods
.method public constructor <init>(FZZ[I[Ljava/lang/String;[IIIZ)V
    .locals 0

    .line 1
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->volume:F

    .line 14
    .line 15
    iput-boolean p2, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muted:Z

    .line 16
    .line 17
    iput-boolean p3, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->muteKnown:Z

    .line 18
    .line 19
    iput-object p4, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputRoutes:[I

    .line 20
    .line 21
    iput-object p5, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputDeviceNames:[Ljava/lang/String;

    .line 22
    .line 23
    iput-object p6, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->outputChannelCounts:[I

    .line 24
    .line 25
    iput p7, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->sampleRate:I

    .line 26
    .line 27
    iput p8, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->bufferSize:I

    .line 28
    .line 29
    iput-boolean p9, p0, Lcom/supercell/titan/AudioAnalyticsMonitor$Snapshot;->otherMediaIsPlaying:Z

    .line 30
    .line 31
    return-void
.end method
