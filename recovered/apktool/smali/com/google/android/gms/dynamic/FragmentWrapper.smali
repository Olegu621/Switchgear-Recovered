.class public final Lcom/google/android/gms/dynamic/FragmentWrapper;
.super Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;
.source "r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83"


# instance fields
.field public final a:Landroid/app/Fragment;


# direct methods
.method public constructor <init>(Landroid/app/Fragment;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/google/android/gms/dynamic/IFragmentWrapper$Stub;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final W(Landroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->startActivity(Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final c0(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->setRetainInstance(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final e(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->setHasOptionsMenu(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final j0(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->registerForContextMenu(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final k(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->setMenuVisibility(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final m0(Lcom/google/android/gms/dynamic/IObjectWrapper;)V
    .locals 0

    .line 1
    invoke-static {p1}, Lcom/google/android/gms/dynamic/ObjectWrapper;->b(Lcom/google/android/gms/dynamic/IObjectWrapper;)Ljava/lang/Object;

    .line 2
    .line 3
    .line 4
    move-result-object p1

    .line 5
    check-cast p1, Landroid/view/View;

    .line 6
    .line 7
    invoke-static {p1}, Lkb1;->n(Ljava/lang/Object;)V

    .line 8
    .line 9
    .line 10
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->unregisterForContextMenu(Landroid/view/View;)V

    .line 13
    .line 14
    .line 15
    return-void
.end method

.method public final o0(Z)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroid/app/Fragment;->setUserVisibleHint(Z)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final t(ILandroid/content/Intent;)V
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0, p2, p1}, Landroid/app/Fragment;->startActivityForResult(Landroid/content/Intent;I)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public final zzb()Lcom/google/android/gms/dynamic/ObjectWrapper;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getActivity()Landroid/app/Activity;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final zzc()Landroid/os/Bundle;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final zzd()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getId()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zze()Lcom/google/android/gms/dynamic/IFragmentWrapper;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getParentFragment()Landroid/app/Fragment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/dynamic/FragmentWrapper;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/FragmentWrapper;-><init>(Landroid/app/Fragment;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final zzf()Lcom/google/android/gms/dynamic/ObjectWrapper;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final zzg()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getRetainInstance()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzh()Ljava/lang/String;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getTag()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    return-object p0
.end method

.method public final zzi()Lcom/google/android/gms/dynamic/IFragmentWrapper;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getTargetFragment()Landroid/app/Fragment;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    new-instance v0, Lcom/google/android/gms/dynamic/FragmentWrapper;

    .line 10
    .line 11
    invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/FragmentWrapper;-><init>(Landroid/app/Fragment;)V

    .line 12
    .line 13
    .line 14
    return-object v0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    return-object p0
.end method

.method public final zzj()I
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getTargetRequestCode()I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzk()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getUserVisibleHint()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzl()Lcom/google/android/gms/dynamic/ObjectWrapper;
    .locals 1

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->getView()Landroid/view/View;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    new-instance v0, Lcom/google/android/gms/dynamic/ObjectWrapper;

    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/google/android/gms/dynamic/ObjectWrapper;-><init>(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method

.method public final zzm()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isAdded()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzn()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isDetached()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzo()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isHidden()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzp()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isInLayout()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzq()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isRemoving()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzr()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isResumed()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method

.method public final zzs()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/google/android/gms/dynamic/FragmentWrapper;->a:Landroid/app/Fragment;

    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Fragment;->isVisible()Z

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    return p0
.end method
