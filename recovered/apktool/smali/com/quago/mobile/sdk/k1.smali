.class public final Lcom/quago/mobile/sdk/k1;
.super Lcom/quago/mobile/sdk/j;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final a()Lcom/quago/mobile/sdk/j;
    .locals 1

    .line 13
    new-instance v0, Lcom/quago/mobile/sdk/k1;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/k1;-><init>()V

    .line 14
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/k1;->a(Lcom/quago/mobile/sdk/j;)V

    return-object v0
.end method

.method public final a(Lcom/quago/mobile/sdk/j;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/quago/mobile/sdk/k1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/k1;

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 9
    .line 10
    iput-wide v0, p1, Lcom/quago/mobile/sdk/j;->a:J

    .line 11
    .line 12
    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/j;)Z
    .locals 0

    .line 20
    const/4 p0, 0x0

    return p0
.end method

.method public final b()[Ljava/lang/Double;
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {p0}, Ljava/lang/Long;->doubleValue()D

    .line 8
    .line 9
    .line 10
    move-result-wide v0

    .line 11
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    filled-new-array {p0}, [Ljava/lang/Double;

    .line 16
    .line 17
    .line 18
    move-result-object p0

    .line 19
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/k1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/quago/mobile/sdk/k1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/k1;->a(Lcom/quago/mobile/sdk/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    new-instance p0, Ljava/lang/StringBuilder;

    .line 4
    .line 5
    const-string v2, "["

    .line 6
    .line 7
    invoke-direct {p0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v0, "]"

    .line 14
    .line 15
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
