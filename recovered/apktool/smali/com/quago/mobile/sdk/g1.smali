.class public final Lcom/quago/mobile/sdk/g1;
.super Lcom/quago/mobile/sdk/j;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public b:I

.field public c:I

.field public d:I

.field public e:I

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 21
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    return-void
.end method

.method public constructor <init>(JIIIIFF)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-wide p1, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 5
    .line 6
    iput p3, p0, Lcom/quago/mobile/sdk/g1;->b:I

    .line 7
    .line 8
    iput p4, p0, Lcom/quago/mobile/sdk/g1;->c:I

    .line 9
    .line 10
    iput p5, p0, Lcom/quago/mobile/sdk/g1;->d:I

    .line 11
    .line 12
    iput p6, p0, Lcom/quago/mobile/sdk/g1;->e:I

    .line 13
    .line 14
    iput p7, p0, Lcom/quago/mobile/sdk/g1;->f:F

    .line 15
    .line 16
    iput p8, p0, Lcom/quago/mobile/sdk/g1;->g:F

    .line 17
    .line 18
    return-void
.end method

.method public constructor <init>(Lcom/quago/mobile/sdk/g1;)V
    .locals 0

    .line 19
    invoke-direct {p0}, Lcom/quago/mobile/sdk/j;-><init>()V

    if-nez p1, :cond_0

    return-void

    .line 20
    :cond_0
    invoke-virtual {p1, p0}, Lcom/quago/mobile/sdk/g1;->a(Lcom/quago/mobile/sdk/j;)V

    return-void
.end method


# virtual methods
.method public final a()Lcom/quago/mobile/sdk/j;
    .locals 1

    .line 37
    new-instance v0, Lcom/quago/mobile/sdk/g1;

    invoke-direct {v0}, Lcom/quago/mobile/sdk/g1;-><init>()V

    .line 38
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/g1;->a(Lcom/quago/mobile/sdk/j;)V

    return-object v0
.end method

.method public final a(Lcom/quago/mobile/sdk/j;)V
    .locals 2

    .line 1
    instance-of v0, p1, Lcom/quago/mobile/sdk/g1;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/g1;

    .line 7
    .line 8
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 9
    .line 10
    iput-wide v0, p1, Lcom/quago/mobile/sdk/j;->a:J

    .line 11
    .line 12
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->b:I

    .line 13
    .line 14
    iput v0, p1, Lcom/quago/mobile/sdk/g1;->b:I

    .line 15
    .line 16
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->c:I

    .line 17
    .line 18
    iput v0, p1, Lcom/quago/mobile/sdk/g1;->c:I

    .line 19
    .line 20
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->d:I

    .line 21
    .line 22
    iput v0, p1, Lcom/quago/mobile/sdk/g1;->d:I

    .line 23
    .line 24
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->e:I

    .line 25
    .line 26
    iput v0, p1, Lcom/quago/mobile/sdk/g1;->e:I

    .line 27
    .line 28
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->f:F

    .line 29
    .line 30
    iput v0, p1, Lcom/quago/mobile/sdk/g1;->f:F

    .line 31
    .line 32
    iget p0, p0, Lcom/quago/mobile/sdk/g1;->g:F

    .line 33
    .line 34
    iput p0, p1, Lcom/quago/mobile/sdk/g1;->g:F

    .line 35
    .line 36
    return-void
.end method

.method public final b(Lcom/quago/mobile/sdk/j;)Z
    .locals 3

    .line 104
    instance-of v0, p1, Lcom/quago/mobile/sdk/g1;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 105
    :cond_0
    check-cast p1, Lcom/quago/mobile/sdk/g1;

    .line 106
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->b:I

    iget v2, p1, Lcom/quago/mobile/sdk/g1;->b:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/g1;->c:I

    iget v2, p1, Lcom/quago/mobile/sdk/g1;->c:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/g1;->d:I

    iget v2, p1, Lcom/quago/mobile/sdk/g1;->d:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/g1;->e:I

    iget v2, p1, Lcom/quago/mobile/sdk/g1;->e:I

    if-ne v0, v2, :cond_1

    iget v0, p0, Lcom/quago/mobile/sdk/g1;->f:F

    iget v2, p1, Lcom/quago/mobile/sdk/g1;->f:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_1

    iget p0, p0, Lcom/quago/mobile/sdk/g1;->g:F

    iget p1, p1, Lcom/quago/mobile/sdk/g1;->g:F

    cmpl-float p0, p0, p1

    if-nez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    return v1
.end method

.method public final b()[Ljava/lang/Double;
    .locals 9

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
    move-result-object v2

    .line 15
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->b:I

    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    invoke-virtual {v0}, Ljava/lang/Integer;->doubleValue()D

    .line 22
    .line 23
    .line 24
    move-result-wide v0

    .line 25
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 26
    .line 27
    .line 28
    move-result-object v3

    .line 29
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->c:I

    .line 30
    .line 31
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    invoke-virtual {v0}, Ljava/lang/Integer;->doubleValue()D

    .line 36
    .line 37
    .line 38
    move-result-wide v0

    .line 39
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 40
    .line 41
    .line 42
    move-result-object v4

    .line 43
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->d:I

    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 46
    .line 47
    .line 48
    move-result-object v0

    .line 49
    invoke-virtual {v0}, Ljava/lang/Integer;->doubleValue()D

    .line 50
    .line 51
    .line 52
    move-result-wide v0

    .line 53
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 54
    .line 55
    .line 56
    move-result-object v5

    .line 57
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->e:I

    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    .line 61
    .line 62
    move-result-object v0

    .line 63
    invoke-virtual {v0}, Ljava/lang/Integer;->doubleValue()D

    .line 64
    .line 65
    .line 66
    move-result-wide v0

    .line 67
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 68
    .line 69
    .line 70
    move-result-object v6

    .line 71
    iget v0, p0, Lcom/quago/mobile/sdk/g1;->f:F

    .line 72
    .line 73
    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 74
    .line 75
    .line 76
    move-result-object v0

    .line 77
    invoke-virtual {v0}, Ljava/lang/Float;->doubleValue()D

    .line 78
    .line 79
    .line 80
    move-result-wide v0

    .line 81
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 82
    .line 83
    .line 84
    move-result-object v7

    .line 85
    iget p0, p0, Lcom/quago/mobile/sdk/g1;->g:F

    .line 86
    .line 87
    invoke-static {p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 88
    .line 89
    .line 90
    move-result-object p0

    .line 91
    invoke-virtual {p0}, Ljava/lang/Float;->doubleValue()D

    .line 92
    .line 93
    .line 94
    move-result-wide v0

    .line 95
    invoke-static {v0, v1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    .line 96
    .line 97
    .line 98
    move-result-object v8

    .line 99
    filled-new-array/range {v2 .. v8}, [Ljava/lang/Double;

    .line 100
    .line 101
    .line 102
    move-result-object p0

    .line 103
    return-object p0
.end method

.method public final clone()Ljava/lang/Object;
    .locals 1

    .line 1
    new-instance v0, Lcom/quago/mobile/sdk/g1;

    .line 2
    .line 3
    invoke-direct {v0}, Lcom/quago/mobile/sdk/g1;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Lcom/quago/mobile/sdk/g1;->a(Lcom/quago/mobile/sdk/j;)V

    .line 7
    .line 8
    .line 9
    return-object v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 9

    .line 1
    iget-wide v0, p0, Lcom/quago/mobile/sdk/j;->a:J

    .line 2
    .line 3
    iget v2, p0, Lcom/quago/mobile/sdk/g1;->b:I

    .line 4
    .line 5
    iget v3, p0, Lcom/quago/mobile/sdk/g1;->c:I

    .line 6
    .line 7
    iget v4, p0, Lcom/quago/mobile/sdk/g1;->d:I

    .line 8
    .line 9
    iget v5, p0, Lcom/quago/mobile/sdk/g1;->e:I

    .line 10
    .line 11
    iget v6, p0, Lcom/quago/mobile/sdk/g1;->f:F

    .line 12
    .line 13
    iget p0, p0, Lcom/quago/mobile/sdk/g1;->g:F

    .line 14
    .line 15
    new-instance v7, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v8, "{timestamp="

    .line 18
    .line 19
    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v7, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    const-string v0, ", screenWidth="

    .line 26
    .line 27
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v0, ", screenHeight="

    .line 34
    .line 35
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    const-string v0, ", appWidth="

    .line 42
    .line 43
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    const-string v0, ", appHeight="

    .line 50
    .line 51
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    const-string v0, ", xdpi="

    .line 58
    .line 59
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    const-string v0, ", ydpi="

    .line 66
    .line 67
    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 71
    .line 72
    .line 73
    const-string p0, "}"

    .line 74
    .line 75
    invoke-virtual {v7, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    move-result-object p0

    .line 82
    return-object p0
.end method
