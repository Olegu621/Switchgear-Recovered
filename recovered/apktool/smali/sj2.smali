.class public final synthetic Lsj2;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"

# interfaces
.implements Ljava/util/Comparator;


# instance fields
.field public final synthetic a:Lnb2;


# direct methods
.method public synthetic constructor <init>(Lnb2;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lsj2;->a:Lnb2;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 4

    .line 1
    check-cast p1, Lmg;

    .line 2
    .line 3
    check-cast p2, Lmg;

    .line 4
    .line 5
    iget-object p0, p0, Lsj2;->a:Lnb2;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    iget-object p0, p1, Lmg;->a:Ld70;

    .line 11
    .line 12
    iget-object p0, p0, Ld70;->j:Ljava/lang/Class;

    .line 13
    .line 14
    const/4 p1, 0x1

    .line 15
    const/4 v0, 0x0

    .line 16
    const-class v1, Lvw1;

    .line 17
    .line 18
    const/4 v2, 0x2

    .line 19
    const-class v3, Landroid/media/MediaCodec;

    .line 20
    .line 21
    if-ne p0, v3, :cond_0

    .line 22
    .line 23
    move p0, v2

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    if-ne p0, v1, :cond_1

    .line 26
    .line 27
    move p0, v0

    .line 28
    goto :goto_0

    .line 29
    :cond_1
    move p0, p1

    .line 30
    :goto_0
    iget-object p2, p2, Lmg;->a:Ld70;

    .line 31
    .line 32
    iget-object p2, p2, Ld70;->j:Ljava/lang/Class;

    .line 33
    .line 34
    if-ne p2, v3, :cond_2

    .line 35
    .line 36
    move p1, v2

    .line 37
    goto :goto_1

    .line 38
    :cond_2
    if-ne p2, v1, :cond_3

    .line 39
    .line 40
    move p1, v0

    .line 41
    :cond_3
    :goto_1
    sub-int/2addr p0, p1

    .line 42
    return p0
.end method
