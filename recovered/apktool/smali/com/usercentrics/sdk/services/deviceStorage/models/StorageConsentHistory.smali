.class public final Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;
.super Ljava/lang/Object;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$$serializer;,
        Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$Companion;


# instance fields
.field public final a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

.field public final b:Z

.field public final c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

.field public final d:Ljava/lang/String;

.field public final e:J


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$Companion;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->Companion:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$Companion;

    .line 7
    .line 8
    return-void
.end method

.method public synthetic constructor <init>(ILcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;ZLcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;Ljava/lang/String;J)V
    .locals 2

    .line 1
    and-int/lit8 v0, p1, 0x1f

    .line 2
    .line 3
    const/16 v1, 0x1f

    .line 4
    .line 5
    if-ne v1, v0, :cond_0

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    iput-object p2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 11
    .line 12
    iput-boolean p3, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 13
    .line 14
    iput-object p4, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 15
    .line 16
    iput-object p5, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 17
    .line 18
    iput-wide p6, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 19
    .line 20
    return-void

    .line 21
    :cond_0
    sget-object p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$$serializer;->INSTANCE:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$$serializer;

    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory$$serializer;->getDescriptor()Lkotlinx/serialization/descriptors/SerialDescriptor;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    invoke-static {p1, v1, p0}, Lb40;->E(IILkotlinx/serialization/descriptors/SerialDescriptor;)V

    .line 28
    .line 29
    .line 30
    const/4 p0, 0x0

    .line 31
    throw p0
.end method

.method public constructor <init>(Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;ZLcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;Ljava/lang/String;J)V
    .locals 0

    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 33
    iput-object p1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 34
    iput-boolean p2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 35
    iput-object p3, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 36
    iput-object p4, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 37
    iput-wide p5, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    return-void
.end method


# virtual methods
.method public final a()Lj61;
    .locals 7

    .line 1
    new-instance v0, Lj61;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 4
    .line 5
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 6
    .line 7
    .line 8
    move-result v1

    .line 9
    const/4 v2, 0x0

    .line 10
    packed-switch v1, :pswitch_data_0

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lds0;->b()V

    .line 14
    .line 15
    .line 16
    return-object v2

    .line 17
    :pswitch_0
    sget-object v1, Lkz2;->w:Lkz2;

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :pswitch_1
    sget-object v1, Lkz2;->v:Lkz2;

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :pswitch_2
    sget-object v1, Lkz2;->i:Lkz2;

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :pswitch_3
    sget-object v1, Lkz2;->f:Lkz2;

    .line 27
    .line 28
    goto :goto_0

    .line 29
    :pswitch_4
    sget-object v1, Lkz2;->e:Lkz2;

    .line 30
    .line 31
    goto :goto_0

    .line 32
    :pswitch_5
    sget-object v1, Lkz2;->d:Lkz2;

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :pswitch_6
    sget-object v1, Lkz2;->c:Lkz2;

    .line 36
    .line 37
    goto :goto_0

    .line 38
    :pswitch_7
    sget-object v1, Lkz2;->b:Lkz2;

    .line 39
    .line 40
    :goto_0
    iget-object v3, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 41
    .line 42
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 43
    .line 44
    .line 45
    move-result v3

    .line 46
    if-eqz v3, :cond_1

    .line 47
    .line 48
    const/4 v4, 0x1

    .line 49
    if-ne v3, v4, :cond_0

    .line 50
    .line 51
    sget-object v2, Lmz2;->b:Lmz2;

    .line 52
    .line 53
    :goto_1
    move-object v3, v2

    .line 54
    goto :goto_2

    .line 55
    :cond_0
    invoke-static {}, Lds0;->b()V

    .line 56
    .line 57
    .line 58
    return-object v2

    .line 59
    :cond_1
    sget-object v2, Lmz2;->a:Lmz2;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :goto_2
    iget-object v4, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 63
    .line 64
    iget-wide v5, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 65
    .line 66
    iget-boolean v2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 67
    .line 68
    invoke-direct/range {v0 .. v6}, Lj61;-><init>(Lkz2;ZLmz2;Ljava/lang/String;J)V

    .line 69
    .line 70
    .line 71
    return-object v0

    .line 72
    nop

    .line 73
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final equals(Ljava/lang/Object;)Z
    .locals 5

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

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
    check-cast p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;

    .line 12
    .line 13
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 14
    .line 15
    iget-object v3, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 16
    .line 17
    if-eq v1, v3, :cond_2

    .line 18
    .line 19
    return v2

    .line 20
    :cond_2
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 21
    .line 22
    iget-boolean v3, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 23
    .line 24
    if-eq v1, v3, :cond_3

    .line 25
    .line 26
    return v2

    .line 27
    :cond_3
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 28
    .line 29
    iget-object v3, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 30
    .line 31
    if-eq v1, v3, :cond_4

    .line 32
    .line 33
    return v2

    .line 34
    :cond_4
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 35
    .line 36
    iget-object v3, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 37
    .line 38
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_5

    .line 43
    .line 44
    return v2

    .line 45
    :cond_5
    iget-wide v3, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 46
    .line 47
    iget-wide p0, p1, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 48
    .line 49
    cmp-long p0, v3, p0

    .line 50
    .line 51
    if-eqz p0, :cond_6

    .line 52
    .line 53
    return v2

    .line 54
    :cond_6
    return v0
.end method

.method public final hashCode()I
    .locals 3

    .line 1
    iget-object v0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

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
    iget-boolean v2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 11
    .line 12
    invoke-static {v0, v1, v2}, Len;->h(IIZ)I

    .line 13
    .line 14
    .line 15
    move-result v0

    .line 16
    iget-object v2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 17
    .line 18
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    .line 19
    .line 20
    .line 21
    move-result v2

    .line 22
    add-int/2addr v2, v0

    .line 23
    mul-int/2addr v2, v1

    .line 24
    iget-object v0, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 25
    .line 26
    invoke-static {v2, v1, v0}, Lpm2;->h(IILjava/lang/String;)I

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    iget-wide v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 31
    .line 32
    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    .line 33
    .line 34
    .line 35
    move-result p0

    .line 36
    add-int/2addr p0, v0

    .line 37
    return p0
.end method

.method public final toString()Ljava/lang/String;
    .locals 4

    .line 1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 2
    .line 3
    const-string v1, "StorageConsentHistory(action="

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->a:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentAction;

    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    .line 13
    const-string v1, ", status="

    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    iget-boolean v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->b:Z

    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string v1, ", type="

    .line 24
    .line 25
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->c:Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentType;

    .line 29
    .line 30
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    const-string v1, ", language="

    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    iget-object v1, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->d:Ljava/lang/String;

    .line 39
    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v1, ", timestampInMillis="

    .line 44
    .line 45
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    const-string v1, ")"

    .line 49
    .line 50
    iget-wide v2, p0, Lcom/usercentrics/sdk/services/deviceStorage/models/StorageConsentHistory;->e:J

    .line 51
    .line 52
    invoke-static {v0, v2, v3, v1}, Lfm0;->m(Ljava/lang/StringBuilder;JLjava/lang/String;)Ljava/lang/String;

    .line 53
    .line 54
    .line 55
    move-result-object p0

    .line 56
    return-object p0
.end method
