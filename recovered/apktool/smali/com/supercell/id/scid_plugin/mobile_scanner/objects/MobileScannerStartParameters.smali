.class public final Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0002\u0008\n\u0018\u00002\u00020\u0001B)\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000b\u0010\u000cR\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\r\u0010\u000cR\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;",
        "",
        "width",
        "",
        "height",
        "rotation",
        "",
        "id",
        "",
        "<init>",
        "(DDIJ)V",
        "getWidth",
        "()D",
        "getHeight",
        "getRotation",
        "()I",
        "getId",
        "()J",
        "scid_plugin_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final height:D

.field private final id:J

.field private final rotation:I

.field private final width:D


# direct methods
.method public constructor <init>(DDIJ)V
    .locals 0

    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    iput-wide p1, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->width:D

    .line 18
    iput-wide p3, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->height:D

    .line 19
    iput p5, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->rotation:I

    .line 20
    iput-wide p6, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->id:J

    return-void
.end method

.method public synthetic constructor <init>(DDIJILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 8

    .line 1
    and-int/lit8 v0, p8, 0x1

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const-wide/16 p1, 0x0

    .line 6
    .line 7
    :cond_0
    move-object v0, p0

    .line 8
    move-wide v1, p1

    .line 9
    move-wide v3, p3

    .line 10
    move v5, p5

    .line 11
    move-wide v6, p6

    .line 12
    invoke-direct/range {v0 .. v7}, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;-><init>(DDIJ)V

    .line 13
    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final getHeight()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->height:D

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getId()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->id:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final getRotation()I
    .locals 0

    .line 1
    iget p0, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->rotation:I

    .line 2
    .line 3
    return p0
.end method

.method public final getWidth()D
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/supercell/id/scid_plugin/mobile_scanner/objects/MobileScannerStartParameters;->width:D

    .line 2
    .line 3
    return-wide v0
.end method
