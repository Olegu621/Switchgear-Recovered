.class public final Lcom/quago/mobile/sdk/w;
.super Lcom/quago/mobile/sdk/j;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    return-void
.end method

.method public constructor <init>(Lcom/quago/mobile/sdk/f;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {p1}, Lcom/quago/mobile/sdk/w;->a(Lcom/quago/mobile/sdk/f;)I

    .line 5
    .line 6
    .line 7
    move-result p1

    .line 8
    iput p1, p0, Lcom/quago/mobile/sdk/w;->b:I

    .line 9
    .line 10
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 11
    .line 12
    .line 13
    move-result-wide v0

    .line 14
    iput-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 15
    .line 16
    return-void
.end method

.method public static a(Lcom/quago/mobile/sdk/f;)I
    .locals 0

    .line 1
    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    .line 2
    .line 3
    .line 4
    move-result p0

    .line 5
    packed-switch p0, :pswitch_data_0

    .line 6
    .line 7
    .line 8
    const/4 p0, 0x0

    .line 9
    return p0

    .line 10
    :pswitch_0
    const/4 p0, 0x3

    .line 11
    return p0

    .line 12
    :pswitch_1
    const/4 p0, 0x2

    .line 13
    return p0

    .line 14
    :pswitch_2
    const/4 p0, 0x1

    .line 15
    return p0

    .line 16
    nop

    .line 17
    :pswitch_data_0
    .packed-switch 0x11
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a()Lcom/quago/mobile/sdk/j;
    .locals 1

    .line 17
    new-instance v0, Lcom/quago/mobile/sdk/w;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/w;-><init>()V

    .line 18
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/w;->a(Lcom/quago/mobile/sdk/j;)V

    return-object v0
.end method

.method public final a(Lcom/quago/mobile/sdk/j;)V
    .locals 2

    .line 19
    instance-of v0, p1, Lcom/quago/mobile/sdk/w;

    if-nez v0, :cond_0

    return-void

    .line 20
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/w;

    .line 21
    iget v0, p0, Lcom/quago/mobile/sdk/w;->b:I

    iput v0, p1, Lcom/quago/mobile/sdk/w;->b:I

    .line 22
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    iput-wide v0, p1, Lcom/quago/mobile/sdk/j;->a:J

    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/j;)Z
    .locals 2

    .line 34
    instance-of v0, p1, Lcom/quago/mobile/sdk/w;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 35
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/w;

    .line 36
    iget p0, p0, Lcom/quago/mobile/sdk/w;->b:I

    iget p1, p1, Lcom/quago/mobile/sdk/w;->b:I

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public final b()[Ljava/lang/Double;
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    invoke-virtual {v0}, Ljava/lang/Long;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget p0, p0, Lcom/quago/mobile/sdk/w;->b:I

    .line 16
    .line 17
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    filled-new-array {v0, p0}, [Ljava/lang/Double;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/w;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/quago/mobile/sdk/w;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/w;->a(Lcom/quago/mobile/sdk/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    iget p0, p0, Lcom/quago/mobile/sdk/w;->b:I

    .line 4
    .line 5
    const/4 v2, 0x1

    .line 6
    if-eq p0, v2, :cond_2

    .line 7
    .line 8
    const/4 v2, 0x2

    .line 9
    if-eq p0, v2, :cond_1

    .line 10
    .line 11
    const/4 v2, 0x3

    .line 12
    if-eq p0, v2, :cond_0

    .line 13
    .line 14
    const/4 p0, 0x0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    sget-object p0, Lcom/quago/mobile/sdk/f;->d:Lcom/quago/mobile/sdk/f;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_1
    sget-object p0, Lcom/quago/mobile/sdk/f;->c:Lcom/quago/mobile/sdk/f;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :cond_2
    sget-object p0, Lcom/quago/mobile/sdk/f;->b:Lcom/quago/mobile/sdk/f;

    .line 23
    .line 24
    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    .line 25
    .line 26
    const-string v3, "["

    .line 27
    .line 28
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    const-string v0, ", "

    .line 35
    .line 36
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string p0, "]"

    .line 43
    .line 44
    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    move-result-object p0

    .line 51
    return-object p0
.end method
