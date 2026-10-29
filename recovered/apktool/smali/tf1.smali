.class public final Ltf1;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Lkotlin/jvm/functions/Function0;

.field public b:Ljava/util/Date;

.field public c:Ljava/util/Date;

.field public d:Ljava/lang/Double;

.field public e:J

.field public final f:Ljava/util/LinkedHashSet;

.field public g:Ly91;

.field public h:J

.field public i:J

.field public j:J

.field public k:J

.field public l:J

.field public m:I

.field public n:I

.field public o:I

.field public p:I


# direct methods
.method public constructor <init>(Lac1;Lkotlin/jvm/functions/Function0;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Ltf1;->a:Lkotlin/jvm/functions/Function0;

    .line 5
    .line 6
    sget-object p1, Lfb0;->b:Leb0;

    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const-wide/16 p1, 0x0

    .line 12
    .line 13
    iput-wide p1, p0, Ltf1;->e:J

    .line 14
    .line 15
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 18
    .line 19
    .line 20
    iput-object v0, p0, Ltf1;->f:Ljava/util/LinkedHashSet;

    .line 21
    .line 22
    iput-wide p1, p0, Ltf1;->h:J

    .line 23
    .line 24
    iput-wide p1, p0, Ltf1;->i:J

    .line 25
    .line 26
    iput-wide p1, p0, Ltf1;->j:J

    .line 27
    .line 28
    iput-wide p1, p0, Ltf1;->k:J

    .line 29
    .line 30
    iput-wide p1, p0, Ltf1;->l:J

    .line 31
    .line 32
    return-void
.end method

.method public static b(Ljava/util/Date;Ljava/util/Date;)J
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/Date;->getTime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    .line 6
    .line 7
    .line 8
    move-result-wide p0

    .line 9
    sub-long/2addr v0, p0

    .line 10
    sget-object p0, Lib0;->c:Lib0;

    .line 11
    .line 12
    invoke-static {v0, v1, p0}, Lmn0;->E(JLib0;)J

    .line 13
    .line 14
    .line 15
    move-result-wide p0

    .line 16
    return-wide p0
.end method


# virtual methods
.method public final a()D
    .locals 6

    .line 1
    iget-wide v0, p0, Ltf1;->i:J

    .line 2
    .line 3
    sget-object v2, Lfb0;->b:Leb0;

    .line 4
    .line 5
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    .line 7
    .line 8
    const-wide/16 v2, 0x0

    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lfb0;->c(JJ)I

    .line 11
    .line 12
    .line 13
    move-result v0

    .line 14
    if-lez v0, :cond_1

    .line 15
    .line 16
    iget-wide v0, p0, Ltf1;->e:J

    .line 17
    .line 18
    iget-wide v2, p0, Ltf1;->i:J

    .line 19
    .line 20
    invoke-static {v0, v1}, Lfb0;->e(J)Lib0;

    .line 21
    .line 22
    .line 23
    move-result-object p0

    .line 24
    invoke-static {v2, v3}, Lfb0;->e(J)Lib0;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-virtual {p0, v4}, Ljava/lang/Enum;->compareTo(Ljava/lang/Object;)I

    .line 29
    .line 30
    .line 31
    move-result v5

    .line 32
    if-ltz v5, :cond_0

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_0
    move-object p0, v4

    .line 36
    :goto_0
    invoke-static {v0, v1, p0}, Lfb0;->i(JLib0;)D

    .line 37
    .line 38
    .line 39
    move-result-wide v0

    .line 40
    invoke-static {v2, v3, p0}, Lfb0;->i(JLib0;)D

    .line 41
    .line 42
    .line 43
    move-result-wide v2

    .line 44
    div-double/2addr v0, v2

    .line 45
    return-wide v0

    .line 46
    :cond_1
    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 47
    .line 48
    return-wide v0
.end method
