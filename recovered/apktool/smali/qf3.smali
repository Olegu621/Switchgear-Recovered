.class public final Lqf3;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljd3;
.implements Lhi;
.implements Lyh3;


# instance fields
.field public final a:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Ljava/lang/Object;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lqf3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public synthetic a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 6

    .line 1
    iget-object p0, p0, Lqf3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    move-object v0, p0

    .line 4
    check-cast v0, Lmp3;

    .line 5
    .line 6
    move-object v1, p1

    .line 7
    move v2, p2

    .line 8
    move-object v3, p3

    .line 9
    move-object v4, p4

    .line 10
    move-object v5, p5

    .line 11
    invoke-virtual/range {v0 .. v5}, Lmp3;->z(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public bridge synthetic setResult(Ljava/lang/Object;)V
    .locals 0

    .line 1
    check-cast p1, Lcom/google/android/gms/common/api/Status;

    .line 2
    .line 3
    iget-object p0, p0, Lqf3;->a:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p0, Lfi;

    .line 6
    .line 7
    check-cast p0, Lfs0;

    .line 8
    .line 9
    invoke-virtual {p0}, Lfs0;->v()V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public zza()Ljava/lang/Object;
    .locals 1

    .line 1
    iget-object p0, p0, Lqf3;->a:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast p0, Lpi3;

    .line 4
    .line 5
    iget-object p0, p0, Lpi3;->a:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p0, Lqf3;

    .line 8
    .line 9
    iget-object p0, p0, Lqf3;->a:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast p0, Landroid/content/Context;

    .line 12
    .line 13
    new-instance v0, Ldf3;

    .line 14
    .line 15
    invoke-direct {v0, p0}, Ldf3;-><init>(Landroid/content/Context;)V

    .line 16
    .line 17
    .line 18
    return-object v0
.end method
