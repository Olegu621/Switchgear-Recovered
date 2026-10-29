.class public final Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure$$serializer;,
        Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure$Companion;

.field public static final i:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/lang/Long;

.field public final e:Z

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;

.field public final h:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->Companion:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure$Companion;

    .line 7
    .line 8
    new-instance v0, Lb10;

    .line 9
    .line 10
    const-class v1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 11
    .line 12
    invoke-static {v1}, Lj22;->a(Ljava/lang/Class;)Ldv;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    sget-object v2, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType$$serializer;

    .line 17
    .line 18
    invoke-static {v2}, Lj13;->i(Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;

    .line 19
    .line 20
    .line 21
    move-result-object v2

    .line 22
    const/4 v3, 0x0

    .line 23
    new-array v4, v3, [Lkotlinx/serialization/KSerializer;

    .line 24
    .line 25
    invoke-direct {v0, v1, v2, v4}, Lb10;-><init>(Ldv;Lkotlinx/serialization/KSerializer;[Lkotlinx/serialization/KSerializer;)V

    .line 26
    .line 27
    .line 28
    new-instance v1, Lgd;

    .line 29
    .line 30
    sget-object v2, Laz0;->a:Laz0;

    .line 31
    .line 32
    invoke-direct {v1, v2, v3}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 33
    .line 34
    .line 35
    const/16 v2, 0x8

    .line 36
    .line 37
    new-array v2, v2, [Lkotlinx/serialization/KSerializer;

    .line 38
    .line 39
    const/4 v4, 0x0

    .line 40
    aput-object v4, v2, v3

    .line 41
    .line 42
    const/4 v3, 0x1

    .line 43
    aput-object v0, v2, v3

    .line 44
    .line 45
    const/4 v0, 0x2

    .line 46
    aput-object v4, v2, v0

    .line 47
    .line 48
    const/4 v0, 0x3

    .line 49
    aput-object v4, v2, v0

    .line 50
    .line 51
    const/4 v0, 0x4

    .line 52
    aput-object v4, v2, v0

    .line 53
    .line 54
    const/4 v0, 0x5

    .line 55
    aput-object v1, v2, v0

    .line 56
    .line 57
    const/4 v0, 0x6

    .line 58
    aput-object v4, v2, v0

    .line 59
    .line 60
    const/4 v0, 0x7

    .line 61
    aput-object v4, v2, v0

    .line 62
    .line 63
    sput-object v2, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->i:[Lkotlinx/serialization/KSerializer;

    .line 64
    .line 65
    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;Ljava/lang/String;Ljava/lang/Long;ZLjava/util/List;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    and-int/lit8 v0, p1, 0x1

    .line 5
    .line 6
    const/4 v1, 0x0

    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->a:Ljava/lang/String;

    .line 10
    .line 11
    goto :goto_0

    .line 12
    :cond_0
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->a:Ljava/lang/String;

    .line 13
    .line 14
    :goto_0
    and-int/lit8 p2, p1, 0x2

    .line 15
    .line 16
    if-nez p2, :cond_1

    .line 17
    .line 18
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 19
    .line 20
    goto :goto_1

    .line 21
    :cond_1
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 22
    .line 23
    :goto_1
    and-int/lit8 p2, p1, 0x4

    .line 24
    .line 25
    if-nez p2, :cond_2

    .line 26
    .line 27
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->c:Ljava/lang/String;

    .line 28
    .line 29
    goto :goto_2

    .line 30
    :cond_2
    iput-object p4, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->c:Ljava/lang/String;

    .line 31
    .line 32
    :goto_2
    and-int/lit8 p2, p1, 0x8

    .line 33
    .line 34
    if-nez p2, :cond_3

    .line 35
    .line 36
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->d:Ljava/lang/Long;

    .line 37
    .line 38
    goto :goto_3

    .line 39
    :cond_3
    iput-object p5, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->d:Ljava/lang/Long;

    .line 40
    .line 41
    :goto_3
    and-int/lit8 p2, p1, 0x10

    .line 42
    .line 43
    if-nez p2, :cond_4

    .line 44
    .line 45
    const/4 p2, 0x0

    .line 46
    iput-boolean p2, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->e:Z

    .line 47
    .line 48
    goto :goto_4

    .line 49
    :cond_4
    iput-boolean p6, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->e:Z

    .line 50
    .line 51
    :goto_4
    and-int/lit8 p2, p1, 0x20

    .line 52
    .line 53
    if-nez p2, :cond_5

    .line 54
    .line 55
    sget-object p2, Lnd0;->a:Lnd0;

    .line 56
    .line 57
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->f:Ljava/util/List;

    .line 58
    .line 59
    goto :goto_5

    .line 60
    :cond_5
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->f:Ljava/util/List;

    .line 61
    .line 62
    :goto_5
    and-int/lit8 p2, p1, 0x40

    .line 63
    .line 64
    if-nez p2, :cond_6

    .line 65
    .line 66
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->g:Ljava/lang/String;

    .line 67
    .line 68
    goto :goto_6

    .line 69
    :cond_6
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->g:Ljava/lang/String;

    .line 70
    .line 71
    :goto_6
    and-int/lit16 p1, p1, 0x80

    .line 72
    .line 73
    if-nez p1, :cond_7

    .line 74
    .line 75
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->h:Ljava/lang/String;

    .line 76
    .line 77
    return-void

    .line 78
    :cond_7
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->h:Ljava/lang/String;

    .line 79
    .line 80
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->a:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 27
    .line 28
    if-eq v1, v3, :cond_3

    .line 29
    .line 30
    return v2

    .line 31
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->c:Ljava/lang/String;

    .line 32
    .line 33
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->c:Ljava/lang/String;

    .line 34
    .line 35
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    if-nez v1, :cond_4

    .line 40
    .line 41
    return v2

    .line 42
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->d:Ljava/lang/Long;

    .line 43
    .line 44
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->d:Ljava/lang/Long;

    .line 45
    .line 46
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 47
    .line 48
    .line 49
    move-result v1

    .line 50
    if-nez v1, :cond_5

    .line 51
    .line 52
    return v2

    .line 53
    :cond_5
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->e:Z

    .line 54
    .line 55
    iget-boolean v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->e:Z

    .line 56
    .line 57
    if-eq v1, v3, :cond_6

    .line 58
    .line 59
    return v2

    .line 60
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->f:Ljava/util/List;

    .line 61
    .line 62
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->f:Ljava/util/List;

    .line 63
    .line 64
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    move-result v1

    .line 68
    if-nez v1, :cond_7

    .line 69
    .line 70
    return v2

    .line 71
    :cond_7
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->g:Ljava/lang/String;

    .line 72
    .line 73
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->g:Ljava/lang/String;

    .line 74
    .line 75
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    .line 77
    .line 78
    move-result v1

    .line 79
    if-nez v1, :cond_8

    .line 80
    .line 81
    return v2

    .line 82
    :cond_8
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->h:Ljava/lang/String;

    .line 83
    .line 84
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->h:Ljava/lang/String;

    .line 85
    .line 86
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 87
    .line 88
    .line 89
    move-result p0

    .line 90
    if-nez p0, :cond_9

    .line 91
    .line 92
    return v2

    .line 93
    :cond_9
    return v0
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->a:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v1, :cond_0

    .line 5
    .line 6
    move v1, v0

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 9
    .line 10
    .line 11
    move-result v1

    .line 12
    :goto_0
    const/16 v2, 0x1f

    .line 13
    .line 14
    mul-int/2addr v1, v2

    .line 15
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 16
    .line 17
    if-nez v3, :cond_1

    .line 18
    .line 19
    move v3, v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 22
    .line 23
    .line 24
    move-result v3

    .line 25
    :goto_1
    add-int/2addr v1, v3

    .line 26
    mul-int/2addr v1, v2

    .line 27
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->c:Ljava/lang/String;

    .line 28
    .line 29
    if-nez v3, :cond_2

    .line 30
    .line 31
    move v3, v0

    .line 32
    goto :goto_2

    .line 33
    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    :goto_2
    add-int/2addr v1, v3

    .line 38
    mul-int/2addr v1, v2

    .line 39
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->d:Ljava/lang/Long;

    .line 40
    .line 41
    if-nez v3, :cond_3

    .line 42
    .line 43
    move v3, v0

    .line 44
    goto :goto_3

    .line 45
    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    .line 46
    .line 47
    .line 48
    move-result v3

    .line 49
    :goto_3
    add-int/2addr v1, v3

    .line 50
    mul-int/2addr v1, v2

    .line 51
    iget-boolean v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->e:Z

    .line 52
    .line 53
    invoke-static {v1, v2, v3}, Len;->h(IIZ)I

    .line 54
    .line 55
    .line 56
    move-result v1

    .line 57
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->f:Ljava/util/List;

    .line 58
    .line 59
    invoke-static {v1, v2, v3}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->g:Ljava/lang/String;

    .line 64
    .line 65
    if-nez v3, :cond_4

    .line 66
    .line 67
    move v3, v0

    .line 68
    goto :goto_4

    .line 69
    :cond_4
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    .line 70
    .line 71
    .line 72
    move-result v3

    .line 73
    :goto_4
    add-int/2addr v1, v3

    .line 74
    mul-int/2addr v1, v2

    .line 75
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->h:Ljava/lang/String;

    .line 76
    .line 77
    if-nez p0, :cond_5

    .line 78
    .line 79
    goto :goto_5

    .line 80
    :cond_5
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 81
    .line 82
    .line 83
    move-result v0

    .line 84
    :goto_5
    add-int/2addr v1, v0

    .line 85
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "ConsentDisclosure(identifier="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->a:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", type="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->b:Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosureType;

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", name="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->c:Ljava/lang/String;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", maxAgeSeconds="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->d:Ljava/lang/Long;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", cookieRefresh="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    iget-boolean v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->e:Z

    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    const-string v1, ", purposes="

    .line 54
    .line 55
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->f:Ljava/util/List;

    .line 59
    .line 60
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    const-string v1, ", domain="

    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    const-string v1, ", description="

    .line 69
    .line 70
    const-string v2, ")"

    .line 71
    .line 72
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->g:Ljava/lang/String;

    .line 73
    .line 74
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/settings/data/ConsentDisclosure;->h:Ljava/lang/String;

    .line 75
    .line 76
    invoke-static {v0, v3, v1, p0, v2}, Lfm0;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    move-result-object p0

    .line 80
    return-object p0
.end method
