.class public final Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$$serializer;,
        Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$Companion;

.field public static final h:[Lkotlinx/serialization/KSerializer;


# instance fields
.field public final a:Ljava/lang/String;

.field public final b:Ljava/lang/String;

.field public final c:J

.field public final d:Ljava/lang/String;

.field public final e:Ljava/lang/String;

.field public final f:Ljava/util/List;

.field public final g:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->Companion:Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$Companion;

    .line 7
    .line 8
    new-instance v0, Lgd;

    .line 9
    .line 10
    sget-object v1, Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/consent/data/ConsentStatusDto$$serializer;

    .line 11
    .line 12
    const/4 v2, 0x0

    .line 13
    invoke-direct {v0, v1, v2}, Lgd;-><init>(Lkotlinx/serialization/KSerializer;I)V

    .line 14
    .line 15
    .line 16
    const/4 v1, 0x7

    .line 17
    new-array v1, v1, [Lkotlinx/serialization/KSerializer;

    .line 18
    .line 19
    const/4 v3, 0x0

    .line 20
    aput-object v3, v1, v2

    .line 21
    .line 22
    const/4 v2, 0x1

    .line 23
    aput-object v3, v1, v2

    .line 24
    .line 25
    const/4 v2, 0x2

    .line 26
    aput-object v3, v1, v2

    .line 27
    .line 28
    const/4 v2, 0x3

    .line 29
    aput-object v3, v1, v2

    .line 30
    .line 31
    const/4 v2, 0x4

    .line 32
    aput-object v3, v1, v2

    .line 33
    .line 34
    const/4 v2, 0x5

    .line 35
    aput-object v0, v1, v2

    .line 36
    .line 37
    const/4 v0, 0x6

    .line 38
    aput-object v3, v1, v0

    .line 39
    .line 40
    sput-object v1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->h:[Lkotlinx/serialization/KSerializer;

    .line 41
    .line 42
    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;)V
    .locals 3

    .line 1
    and-int/lit8 v0, p1, 0x26

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const/16 v2, 0x26

    .line 5
    .line 6
    if-ne v2, v0, :cond_4

    .line 7
    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    and-int/lit8 v0, p1, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->a:Ljava/lang/String;

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    iput-object p2, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->a:Ljava/lang/String;

    .line 19
    .line 20
    :goto_0
    iput-object p3, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->b:Ljava/lang/String;

    .line 21
    .line 22
    iput-wide p4, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->c:J

    .line 23
    .line 24
    and-int/lit8 p2, p1, 0x8

    .line 25
    .line 26
    if-nez p2, :cond_1

    .line 27
    .line 28
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->d:Ljava/lang/String;

    .line 29
    .line 30
    goto :goto_1

    .line 31
    :cond_1
    iput-object p6, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->d:Ljava/lang/String;

    .line 32
    .line 33
    :goto_1
    and-int/lit8 p2, p1, 0x10

    .line 34
    .line 35
    if-nez p2, :cond_2

    .line 36
    .line 37
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->e:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_2

    .line 40
    :cond_2
    iput-object p7, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->e:Ljava/lang/String;

    .line 41
    .line 42
    :goto_2
    iput-object p8, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->f:Ljava/util/List;

    .line 43
    .line 44
    and-int/lit8 p1, p1, 0x40

    .line 45
    .line 46
    if-nez p1, :cond_3

    .line 47
    .line 48
    iput-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->g:Ljava/lang/String;

    .line 49
    .line 50
    return-void

    .line 51
    :cond_3
    iput-object p9, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->g:Ljava/lang/String;

    .line 52
    .line 53
    return-void

    .line 54
    :cond_4
    sget-object p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$$serializer;->INSTANCE:Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$$serializer;

    .line 55
    .line 56
    invoke-virtual {p0}, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    invoke-static {p1, v2, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 61
    .line 62
    .line 63
    throw v1
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;

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
    check-cast p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->a:Ljava/lang/String;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->a:Ljava/lang/String;

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
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->b:Ljava/lang/String;

    .line 25
    .line 26
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->b:Ljava/lang/String;

    .line 27
    .line 28
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    if-nez v1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    iget-wide v3, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->c:J

    .line 36
    .line 37
    iget-wide v5, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->c:J

    .line 38
    .line 39
    cmp-long v1, v3, v5

    .line 40
    .line 41
    if-eqz v1, :cond_4

    .line 42
    .line 43
    return v2

    .line 44
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->d:Ljava/lang/String;

    .line 45
    .line 46
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->d:Ljava/lang/String;

    .line 47
    .line 48
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    move-result v1

    .line 52
    if-nez v1, :cond_5

    .line 53
    .line 54
    return v2

    .line 55
    :cond_5
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->e:Ljava/lang/String;

    .line 56
    .line 57
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->e:Ljava/lang/String;

    .line 58
    .line 59
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 60
    .line 61
    .line 62
    move-result v1

    .line 63
    if-nez v1, :cond_6

    .line 64
    .line 65
    return v2

    .line 66
    :cond_6
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->f:Ljava/util/List;

    .line 67
    .line 68
    iget-object v3, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->f:Ljava/util/List;

    .line 69
    .line 70
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    move-result v1

    .line 74
    if-nez v1, :cond_7

    .line 75
    .line 76
    return v2

    .line 77
    :cond_7
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->g:Ljava/lang/String;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->g:Ljava/lang/String;

    .line 80
    .line 81
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 82
    .line 83
    .line 84
    move-result p0

    .line 85
    if-nez p0, :cond_8

    .line 86
    .line 87
    return v2

    .line 88
    :cond_8
    return v0
.end method

.method public final hashCode()I
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->a:Ljava/lang/String;

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
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->b:Ljava/lang/String;

    .line 16
    .line 17
    invoke-static {v1, v2, v3}, Lpm2;->h(IILjava/lang/String;)I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    iget-wide v3, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->c:J

    .line 22
    .line 23
    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    .line 24
    .line 25
    .line 26
    move-result v3

    .line 27
    add-int/2addr v3, v1

    .line 28
    mul-int/2addr v3, v2

    .line 29
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->d:Ljava/lang/String;

    .line 30
    .line 31
    if-nez v1, :cond_1

    .line 32
    .line 33
    move v1, v0

    .line 34
    goto :goto_1

    .line 35
    :cond_1
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    :goto_1
    add-int/2addr v3, v1

    .line 40
    mul-int/2addr v3, v2

    .line 41
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->e:Ljava/lang/String;

    .line 42
    .line 43
    if-nez v1, :cond_2

    .line 44
    .line 45
    move v1, v0

    .line 46
    goto :goto_2

    .line 47
    :cond_2
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 48
    .line 49
    .line 50
    move-result v1

    .line 51
    :goto_2
    add-int/2addr v3, v1

    .line 52
    mul-int/2addr v3, v2

    .line 53
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->f:Ljava/util/List;

    .line 54
    .line 55
    invoke-static {v3, v2, v1}, Lcom/appsflyer/internal/j;->b(IILjava/util/List;)I

    .line 56
    .line 57
    .line 58
    move-result v1

    .line 59
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->g:Ljava/lang/String;

    .line 60
    .line 61
    if-nez p0, :cond_3

    .line 62
    .line 63
    goto :goto_3

    .line 64
    :cond_3
    invoke-virtual {p0}, Ljava/lang/String;->hashCode()I

    .line 65
    .line 66
    .line 67
    move-result v0

    .line 68
    :goto_3
    add-int/2addr v1, v0

    .line 69
    return v1
.end method

.method public final toString()Ljava/lang/String;
    .locals 5

    .line 1
    const-string v0, ", settingsVersion="

    .line 2
    .line 3
    const-string v1, ", timestampInMillis="

    .line 4
    .line 5
    const-string v2, "ConsentsDataDto(action="

    .line 6
    .line 7
    iget-object v3, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->a:Ljava/lang/String;

    .line 8
    .line 9
    iget-object v4, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->b:Ljava/lang/String;

    .line 10
    .line 11
    invoke-static {v2, v3, v0, v4, v1}, Len;->r(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    move-result-object v0

    .line 15
    iget-wide v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->c:J

    .line 16
    .line 17
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    const-string v1, ", consentString="

    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->d:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    .line 30
    const-string v1, ", consentMeta="

    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    .line 35
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->e:Ljava/lang/String;

    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v1, ", consents="

    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    iget-object v1, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->f:Ljava/util/List;

    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string v1, ", acString="

    .line 51
    .line 52
    const-string v2, ")"

    .line 53
    .line 54
    iget-object p0, p0, Lcom/usercentrics/sdk/v2/consent/data/ConsentsDataDto;->g:Ljava/lang/String;

    .line 55
    .line 56
    invoke-static {v0, v1, p0, v2}, Lfm0;->p(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object p0

    .line 60
    return-object p0
.end method
