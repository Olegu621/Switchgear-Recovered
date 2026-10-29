.class public final Lcom/quago/mobile/sdk/o;
.super Lcom/quago/mobile/sdk/j;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:F

.field public c:F

.field public d:F


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

    .line 25
    new-instance v0, Lcom/quago/mobile/sdk/o;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/o;-><init>()V

    .line 26
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/o;->a(Lcom/quago/mobile/sdk/j;)V

    return-object v0
.end method

.method public final a(Lcom/quago/mobile/sdk/j;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/quago/mobile/sdk/o;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/o;

    .line 7
    .line 8
    iget v0, p0, Lcom/quago/mobile/sdk/o;->b:F

    .line 9
    .line 10
    iput v0, p1, Lcom/quago/mobile/sdk/o;->b:F

    .line 11
    .line 12
    iget v0, p0, Lcom/quago/mobile/sdk/o;->c:F

    .line 13
    .line 14
    iput v0, p1, Lcom/quago/mobile/sdk/o;->c:F

    .line 15
    .line 16
    iget v0, p0, Lcom/quago/mobile/sdk/o;->d:F

    .line 17
    .line 18
    iput v0, p1, Lcom/quago/mobile/sdk/o;->d:F

    .line 19
    .line 20
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 21
    .line 22
    iput-wide v0, p1, Lcom/quago/mobile/sdk/j;->a:J

    .line 23
    .line 24
    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/j;)Z
    .locals 3

    .line 62
    instance-of v0, p1, Lcom/quago/mobile/sdk/o;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 63
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/o;

    .line 64
    iget v0, p0, Lcom/quago/mobile/sdk/o;->b:F

    iget v2, p1, Lcom/quago/mobile/sdk/o;->b:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/o;->c:F

    iget v2, p1, Lcom/quago/mobile/sdk/o;->c:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget p0, p0, Lcom/quago/mobile/sdk/o;->d:F

    iget p1, p1, Lcom/quago/mobile/sdk/o;->d:F

    cmpl-float p0, p0, p1

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public final b()[Ljava/lang/Double;
    .locals 5

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
    iget v1, p0, Lcom/quago/mobile/sdk/o;->b:F

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Float;->doubleValue()D

    .line 22
    .line 23
    .line 24
    move-result-wide v1

    .line 25
    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v1

    .line 29
    iget v2, p0, Lcom/quago/mobile/sdk/o;->c:F

    .line 30
    .line 31
    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 32
    .line 33
    .line 34
    move-result-object v2

    .line 35
    invoke-virtual {v2}, Ljava/lang/Float;->doubleValue()D

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object v2

    .line 43
    iget p0, p0, Lcom/quago/mobile/sdk/o;->d:F

    .line 44
    .line 45
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p0}, Ljava/lang/Float;->doubleValue()D

    .line 50
    .line 51
    .line 52
    move-result-wide v3

    .line 53
    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object p0

    .line 57
    filled-new-array {v0, v1, v2, p0}, [Ljava/lang/Double;

    .line 58
    .line 59
    .line 60
    move-result-object p0

    .line 61
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/o;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/quago/mobile/sdk/o;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/o;->a(Lcom/quago/mobile/sdk/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    iget v2, p0, Lcom/quago/mobile/sdk/o;->b:F

    .line 4
    .line 5
    iget v3, p0, Lcom/quago/mobile/sdk/o;->c:F

    .line 6
    .line 7
    iget p0, p0, Lcom/quago/mobile/sdk/o;->d:F

    .line 8
    .line 9
    new-instance v4, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    const-string v5, "["

    .line 12
    .line 13
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v0, ", "

    .line 20
    .line 21
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p0, "]"

    .line 40
    .line 41
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p0

    .line 48
    return-object p0
.end method
