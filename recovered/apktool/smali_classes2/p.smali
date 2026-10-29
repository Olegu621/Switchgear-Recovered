.class public final Lp;
.super Lpy0;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final k:Lb5;

.field public final synthetic l:Lc21;

.field public final synthetic m:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lc21;Ljava/lang/String;)V
    .locals 1

    .line 1
    const/4 v0, 0x4

    .line 2
    invoke-direct {p0, v0}, Lpy0;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, Lp;->l:Lc21;

    .line 6
    .line 7
    iput-object p2, p0, Lp;->m:Ljava/lang/String;

    .line 8
    .line 9
    iget-object p1, p1, Lc21;->b:Lb11;

    .line 10
    .line 11
    iget-object p1, p1, Lb11;->b:Lb5;

    .line 12
    .line 13
    iput-object p1, p0, Lp;->k:Lb5;

    .line 14
    .line 15
    return-void
.end method


# virtual methods
.method public final B(J)V
    .locals 10

    .line 1
    sget-object v0, Lsw2;->b:Lrw2;

    .line 2
    .line 3
    const-wide/16 v0, 0x0

    .line 4
    .line 5
    cmp-long v2, p1, v0

    .line 6
    .line 7
    if-nez v2, :cond_0

    .line 8
    .line 9
    const-string p1, "0"

    .line 10
    .line 11
    goto :goto_1

    .line 12
    :cond_0
    const/16 v3, 0xa

    .line 13
    .line 14
    if-lez v2, :cond_1

    .line 15
    .line 16
    invoke-static {p1, p2, v3}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    const/16 v2, 0x40

    .line 22
    .line 23
    new-array v2, v2, [C

    .line 24
    .line 25
    const/4 v4, 0x1

    .line 26
    ushr-long v4, p1, v4

    .line 27
    .line 28
    const-wide/16 v6, 0x5

    .line 29
    .line 30
    div-long/2addr v4, v6

    .line 31
    const-wide/16 v6, 0xa

    .line 32
    .line 33
    mul-long v8, v4, v6

    .line 34
    .line 35
    sub-long/2addr p1, v8

    .line 36
    long-to-int p1, p1

    .line 37
    invoke-static {p1, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 38
    .line 39
    .line 40
    move-result p1

    .line 41
    const/16 p2, 0x3f

    .line 42
    .line 43
    aput-char p1, v2, p2

    .line 44
    .line 45
    :goto_0
    cmp-long p1, v4, v0

    .line 46
    .line 47
    if-lez p1, :cond_2

    .line 48
    .line 49
    add-int/lit8 p2, p2, -0x1

    .line 50
    .line 51
    rem-long v8, v4, v6

    .line 52
    .line 53
    long-to-int p1, v8

    .line 54
    invoke-static {p1, v3}, Ljava/lang/Character;->forDigit(II)C

    .line 55
    .line 56
    .line 57
    move-result p1

    .line 58
    aput-char p1, v2, p2

    .line 59
    .line 60
    div-long/2addr v4, v6

    .line 61
    goto :goto_0

    .line 62
    :cond_2
    new-instance p1, Ljava/lang/String;

    .line 63
    .line 64
    rsub-int/lit8 v0, p2, 0x40

    .line 65
    .line 66
    invoke-direct {p1, v2, p2, v0}, Ljava/lang/String;-><init>([CII)V

    .line 67
    .line 68
    .line 69
    :goto_1
    invoke-virtual {p0, p1}, Lp;->y0(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    return-void
.end method

.method public final a()Lb5;
    .locals 0

    .line 1
    iget-object p0, p0, Lp;->k:Lb5;

    .line 2
    .line 3
    return-object p0
.end method

.method public final h(S)V
    .locals 1

    .line 1
    sget-object v0, Lax2;->b:Lzw2;

    .line 2
    .line 3
    const v0, 0xffff

    .line 4
    .line 5
    .line 6
    and-int/2addr p1, v0

    .line 7
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object p1

    .line 11
    invoke-virtual {p0, p1}, Lp;->y0(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    return-void
.end method

.method public final j(B)V
    .locals 1

    .line 1
    sget-object v0, Lts2;->b:Lss2;

    .line 2
    .line 3
    and-int/lit16 p1, p1, 0xff

    .line 4
    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-virtual {p0, p1}, Lp;->y0(Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method

.method public final y(I)V
    .locals 4

    .line 1
    sget-object v0, Lmw2;->b:Llw2;

    .line 2
    .line 3
    int-to-long v0, p1

    .line 4
    const-wide v2, 0xffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    and-long/2addr v0, v2

    .line 10
    const/16 p1, 0xa

    .line 11
    .line 12
    invoke-static {v0, v1, p1}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    invoke-virtual {p0, p1}, Lp;->y0(Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method

.method public final y0(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    new-instance v0, Ls11;

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    invoke-direct {v0, p1, v1}, Ls11;-><init>(Ljava/lang/Object;Z)V

    .line 8
    .line 9
    .line 10
    iget-object p1, p0, Lp;->l:Lc21;

    .line 11
    .line 12
    iget-object p0, p0, Lp;->m:Ljava/lang/String;

    .line 13
    .line 14
    invoke-virtual {p1, p0, v0}, Lc21;->M(Ljava/lang/String;Lkotlinx/serialization/json/b;)V

    .line 15
    .line 16
    .line 17
    return-void
.end method
