.class public final Lcom/usercentrics/sdk/UsercentricsOptions;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/UsercentricsOptions$$serializer;,
        Lcom/usercentrics/sdk/UsercentricsOptions$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/UsercentricsOptions$Companion;

.field public static final k:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Ljava/lang/String;

.field public d:J

.field public e:Ll03;

.field public f:Ljava/lang/String;

.field public g:Z

.field public h:Lcom/usercentrics/sdk/UsercentricsDomains;

.field public i:J

.field public j:Lbn1;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/UsercentricsOptions$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/UsercentricsOptions;->Companion:Lcom/usercentrics/sdk/UsercentricsOptions$Companion;

    .line 7
    .line 8
    new-instance v0, Lb10;

    .line 9
    .line 10
    const-class v1, Ll03;

    .line 11
    .line 12
    invoke-static {v1}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    new-instance v2, Loe0;

    .line 17
    .line 18
    const-string v3, "com.usercentrics.sdk.models.common.UsercentricsLoggerLevel"

    .line 19
    .line 20
    invoke-static {}, Ll03;->values()[Ll03;

    .line 21
    .line 22
    .line 23
    move-result-object v4

    .line 24
    invoke-direct {v2, v3, v4}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 25
    .line 26
    .line 27
    const/4 v3, 0x0

    .line 28
    new-array v4, v3, [Lkotlinx/serialization/KSerializer;

    .line 29
    .line 30
    invoke-direct {v0, v1, v2, v4}, Lb10;-><init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V

    .line 31
    .line 32
    .line 33
    new-instance v1, Lb10;

    .line 34
    .line 35
    const-class v2, Lbn1;

    .line 36
    .line 37
    invoke-static {v2}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 38
    .line 39
    .line 40
    move-result-object v2

    .line 41
    new-instance v4, Loe0;

    .line 42
    .line 43
    const-string v5, "com.usercentrics.sdk.models.common.NetworkMode"

    .line 44
    .line 45
    invoke-static {}, Lbn1;->values()[Lbn1;

    .line 46
    .line 47
    .line 48
    move-result-object v6

    .line 49
    invoke-direct {v4, v5, v6}, Loe0;-><init>(Ljava/lang/String;[Ljava/lang/Enum;)V

    .line 50
    .line 51
    .line 52
    new-array v5, v3, [Lkotlinx/serialization/KSerializer;

    .line 53
    .line 54
    invoke-direct {v1, v2, v4, v5}, Lb10;-><init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V

    .line 55
    .line 56
    .line 57
    const/16 v2, 0xa

    .line 58
    .line 59
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    .line 60
    .line 61
    const/4 v4, 0x0

    .line 62
    aput-object v4, v2, v3

    .line 63
    .line 64
    const/4 v3, 0x1

    .line 65
    aput-object v4, v2, v3

    .line 66
    .line 67
    const/4 v3, 0x2

    .line 68
    aput-object v4, v2, v3

    .line 69
    .line 70
    const/4 v3, 0x3

    .line 71
    aput-object v4, v2, v3

    .line 72
    .line 73
    const/4 v3, 0x4

    .line 74
    aput-object v0, v2, v3

    .line 75
    .line 76
    const/4 v0, 0x5

    .line 77
    aput-object v4, v2, v0

    .line 78
    .line 79
    const/4 v0, 0x6

    .line 80
    aput-object v4, v2, v0

    .line 81
    .line 82
    const/4 v0, 0x7

    .line 83
    aput-object v4, v2, v0

    .line 84
    .line 85
    const/16 v0, 0x8

    .line 86
    .line 87
    aput-object v4, v2, v0

    .line 88
    .line 89
    const/16 v0, 0x9

    .line 90
    .line 91
    aput-object v1, v2, v0

    .line 92
    .line 93
    sput-object v2, Lcom/usercentrics/sdk/UsercentricsOptions;->k:[Lkotlinx/serialization/KSerializer;

    .line 94
    .line 95
    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JLl03;Ljava/lang/String;ZLcom/usercentrics/sdk/UsercentricsDomains;J)V
    .locals 0

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 20
    .line 21
    iput-object p2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 22
    .line 23
    iput-object p3, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 24
    .line 25
    iput-wide p4, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 26
    .line 27
    iput-object p6, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 28
    .line 29
    iput-object p7, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 30
    .line 31
    iput-boolean p8, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 32
    .line 33
    iput-object p9, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 34
    .line 35
    iput-wide p10, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 36
    .line 37
    sget-object p3, Lbn1;->a:Lbn1;

    .line 38
    .line 39
    iput-object p3, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 42
    .line 43
    .line 44
    move-result-object p1

    .line 45
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 46
    .line 47
    .line 48
    move-result-object p1

    .line 49
    iput-object p1, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-static {p2}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    iput-object p1, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 60
    .line 61
    iget-object p1, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 62
    .line 63
    invoke-static {p1}, Lkotlin/text/StringsKt;->O(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 64
    .line 65
    .line 66
    move-result-object p1

    .line 67
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 68
    .line 69
    .line 70
    move-result-object p1

    .line 71
    iput-object p1, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 72
    .line 73
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 6

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x0

    .line 6
    if-eqz p1, :cond_b

    .line 7
    .line 8
    const-class v2, Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 9
    .line 10
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    move-result-object v3

    .line 14
    if-eq v2, v3, :cond_1

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_1
    check-cast p1, Lcom/usercentrics/sdk/UsercentricsOptions;

    .line 18
    .line 19
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 20
    .line 21
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_2

    .line 28
    .line 29
    return v1

    .line 30
    :cond_2
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 31
    .line 32
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 33
    .line 34
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 35
    .line 36
    .line 37
    move-result v2

    .line 38
    if-nez v2, :cond_3

    .line 39
    .line 40
    return v1

    .line 41
    :cond_3
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 42
    .line 43
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 44
    .line 45
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    if-nez v2, :cond_4

    .line 50
    .line 51
    return v1

    .line 52
    :cond_4
    iget-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 53
    .line 54
    iget-wide v4, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 55
    .line 56
    cmp-long v2, v2, v4

    .line 57
    .line 58
    if-eqz v2, :cond_5

    .line 59
    .line 60
    return v1

    .line 61
    :cond_5
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 62
    .line 63
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 64
    .line 65
    if-eq v2, v3, :cond_6

    .line 66
    .line 67
    return v1

    .line 68
    :cond_6
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 69
    .line 70
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 71
    .line 72
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 73
    .line 74
    .line 75
    move-result v2

    .line 76
    if-nez v2, :cond_7

    .line 77
    .line 78
    return v1

    .line 79
    :cond_7
    iget-boolean v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 80
    .line 81
    iget-boolean v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 82
    .line 83
    if-eq v2, v3, :cond_8

    .line 84
    .line 85
    return v1

    .line 86
    :cond_8
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 87
    .line 88
    iget-object v3, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 89
    .line 90
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    move-result v2

    .line 94
    if-nez v2, :cond_9

    .line 95
    .line 96
    return v1

    .line 97
    :cond_9
    iget-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 98
    .line 99
    iget-wide v4, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 100
    .line 101
    cmp-long v2, v2, v4

    .line 102
    .line 103
    if-eqz v2, :cond_a

    .line 104
    .line 105
    return v1

    .line 106
    :cond_a
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 107
    .line 108
    iget-object p1, p1, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 109
    .line 110
    if-ne p0, p1, :cond_b

    .line 111
    .line 112
    return v0

    .line 113
    :cond_b
    :goto_0
    return v1
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->a:Ljava/lang/String;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/16 v1, 0x1f

    .line 8
    .line 9
    mul-int/2addr v0, v1

    .line 10
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->b:Ljava/lang/String;

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->c:Ljava/lang/String;

    .line 17
    .line 18
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 19
    .line 20
    .line 21
    move-result v0

    .line 22
    iget-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->d:J

    .line 23
    .line 24
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 25
    .line 26
    .line 27
    move-result v2

    .line 28
    add-int/2addr v2, v0

    .line 29
    mul-int/2addr v2, v1

    .line 30
    iget-object v0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->e:Ll03;

    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    .line 33
    .line 34
    .line 35
    move-result v0

    .line 36
    add-int/2addr v0, v2

    .line 37
    mul-int/2addr v0, v1

    .line 38
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->f:Ljava/lang/String;

    .line 39
    .line 40
    invoke-static {v0, v1, v2}, Lpm2;->h(IILjava/lang/String;)I

    .line 41
    .line 42
    .line 43
    move-result v0

    .line 44
    iget-boolean v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->g:Z

    .line 45
    .line 46
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 47
    .line 48
    .line 49
    move-result v0

    .line 50
    iget-object v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->h:Lcom/usercentrics/sdk/UsercentricsDomains;

    .line 51
    .line 52
    if-eqz v2, :cond_0

    .line 53
    .line 54
    invoke-virtual {v2}, Lcom/usercentrics/sdk/UsercentricsDomains;->hashCode()I

    .line 55
    .line 56
    .line 57
    move-result v2

    .line 58
    goto :goto_0

    .line 59
    :cond_0
    const/4 v2, 0x0

    .line 60
    :goto_0
    add-int/2addr v0, v2

    .line 61
    mul-int/2addr v0, v1

    .line 62
    iget-wide v2, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->i:J

    .line 63
    .line 64
    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    .line 65
    .line 66
    .line 67
    move-result v2

    .line 68
    add-int/2addr v2, v0

    .line 69
    mul-int/2addr v2, v1

    .line 70
    iget-object p0, p0, Lcom/usercentrics/sdk/UsercentricsOptions;->j:Lbn1;

    .line 71
    .line 72
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 73
    .line 74
    .line 75
    move-result p0

    .line 76
    add-int/2addr p0, v2

    .line 77
    return p0
.end method
