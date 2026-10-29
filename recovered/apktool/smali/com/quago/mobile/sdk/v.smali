.class public final Lcom/quago/mobile/sdk/v;
.super Lcom/quago/mobile/sdk/j;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:J

.field public c:I

.field public d:I

.field public e:I


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

    .line 29
    new-instance v0, Lcom/quago/mobile/sdk/v;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/v;-><init>()V

    .line 30
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/v;->a(Lcom/quago/mobile/sdk/j;)V

    return-object v0
.end method

.method public final a(Lcom/quago/mobile/sdk/j;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/quago/mobile/sdk/v;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/v;

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/quago/mobile/sdk/v;->b:J

    .line 9
    .line 10
    iput-wide v0, p1, Lcom/quago/mobile/sdk/v;->b:J

    .line 11
    .line 12
    iget v0, p0, Lcom/quago/mobile/sdk/v;->c:I

    .line 13
    .line 14
    iput v0, p1, Lcom/quago/mobile/sdk/v;->c:I

    .line 15
    .line 16
    iget v0, p0, Lcom/quago/mobile/sdk/v;->d:I

    .line 17
    .line 18
    iput v0, p1, Lcom/quago/mobile/sdk/v;->d:I

    .line 19
    .line 20
    iget v0, p0, Lcom/quago/mobile/sdk/v;->e:I

    .line 21
    .line 22
    iput v0, p1, Lcom/quago/mobile/sdk/v;->e:I

    .line 23
    .line 24
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 25
    .line 26
    iput-wide v0, p1, Lcom/quago/mobile/sdk/j;->a:J

    .line 27
    .line 28
    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/j;)Z
    .locals 6

    .line 48
    instance-of v0, p1, Lcom/quago/mobile/sdk/v;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 49
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/v;

    .line 50
    iget v0, p0, Lcom/quago/mobile/sdk/v;->c:I

    iget v2, p1, Lcom/quago/mobile/sdk/v;->c:I

    if-ne v0, v2, :cond_1

    iget-wide v2, p0, Lcom/quago/mobile/sdk/v;->b:J

    iget-wide v4, p1, Lcom/quago/mobile/sdk/v;->b:J

    cmp-long v0, v2, v4

    if-nez v0, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/v;->d:I

    iget v2, p1, Lcom/quago/mobile/sdk/v;->d:I

    if-ne v0, v2, :cond_1

    iget p0, p0, Lcom/quago/mobile/sdk/v;->e:I

    iget p1, p1, Lcom/quago/mobile/sdk/v;->e:I

    if-ne p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public final b()[Ljava/lang/Double;
    .locals 4

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
    iget-wide v1, p0, Lcom/quago/mobile/sdk/v;->b:J

    .line 16
    .line 17
    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 18
    .line 19
    .line 20
    move-result-object v1

    .line 21
    invoke-virtual {v1}, Ljava/lang/Long;->doubleValue()D

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
    iget p0, p0, Lcom/quago/mobile/sdk/v;->c:I

    .line 30
    .line 31
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object p0

    .line 35
    invoke-virtual {p0}, Ljava/lang/Integer;->doubleValue()D

    .line 36
    .line 37
    .line 38
    move-result-wide v2

    .line 39
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object p0

    .line 43
    filled-new-array {v0, v1, p0}, [Ljava/lang/Double;

    .line 44
    .line 45
    .line 46
    move-result-object p0

    .line 47
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/v;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/quago/mobile/sdk/v;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/v;->a(Lcom/quago/mobile/sdk/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 6

    .line 1
    iget v0, p0, Lcom/quago/mobile/sdk/v;->c:I

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    if-eq v0, v1, :cond_1

    .line 5
    .line 6
    const/4 v1, 0x2

    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    const-string v0, "?"

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    const-string v0, "\u2191"

    .line 13
    .line 14
    goto :goto_0

    .line 15
    :cond_1
    const-string v0, "\u2193"

    .line 16
    .line 17
    :goto_0
    iget-wide v1, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 18
    .line 19
    iget v3, p0, Lcom/quago/mobile/sdk/v;->d:I

    .line 20
    .line 21
    invoke-static {v3}, Lcom/quago/mobile/sdk/g;->a(I)I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    iget p0, p0, Lcom/quago/mobile/sdk/v;->e:I

    .line 26
    .line 27
    new-instance v4, Ljava/lang/StringBuilder;

    .line 28
    .line 29
    const-string v5, "["

    .line 30
    .line 31
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string v0, ", "

    .line 38
    .line 39
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string p0, "]"

    .line 58
    .line 59
    invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    .line 64
    .line 65
    move-result-object p0

    .line 66
    return-object p0
.end method
