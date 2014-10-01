



<!DOCTYPE html>
<html lang="en" class="">
  <head prefix="og: http://ogp.me/ns# fb: http://ogp.me/ns/fb# object: http://ogp.me/ns/object# article: http://ogp.me/ns/article# profile: http://ogp.me/ns/profile#">
    <meta charset='utf-8'>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta http-equiv="Content-Language" content="en">
    
    
    <title>progfun-wiki/CheatSheet.md at gh-pages · lampepfl/progfun-wiki</title>
    <link rel="search" type="application/opensearchdescription+xml" href="/opensearch.xml" title="GitHub">
    <link rel="fluid-icon" href="https://github.com/fluidicon.png" title="GitHub">
    <link rel="apple-touch-icon" sizes="57x57" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="114x114" href="/apple-touch-icon-114.png">
    <link rel="apple-touch-icon" sizes="72x72" href="/apple-touch-icon-144.png">
    <link rel="apple-touch-icon" sizes="144x144" href="/apple-touch-icon-144.png">
    <meta property="fb:app_id" content="1401488693436528">

      <meta content="@github" name="twitter:site" /><meta content="summary" name="twitter:card" /><meta content="lampepfl/progfun-wiki" name="twitter:title" /><meta content="Contribute to progfun-wiki development by creating an account on GitHub." name="twitter:description" /><meta content="https://avatars0.githubusercontent.com/u/2684793?v=2&amp;s=400" name="twitter:image:src" />
<meta content="GitHub" property="og:site_name" /><meta content="object" property="og:type" /><meta content="https://avatars0.githubusercontent.com/u/2684793?v=2&amp;s=400" property="og:image" /><meta content="lampepfl/progfun-wiki" property="og:title" /><meta content="https://github.com/lampepfl/progfun-wiki" property="og:url" /><meta content="Contribute to progfun-wiki development by creating an account on GitHub." property="og:description" />

      <meta name="browser-stats-url" content="/_stats">
    <link rel="assets" href="https://assets-cdn.github.com/">
    <link rel="conduit-xhr" href="https://ghconduit.com:25035">
    <link rel="xhr-socket" href="/_sockets">
    <meta name="pjax-timeout" content="1000">

    <meta name="msapplication-TileImage" content="/windows-tile.png">
    <meta name="msapplication-TileColor" content="#ffffff">
    <meta name="selected-link" value="repo_source" data-pjax-transient>
      <meta name="google-analytics" content="UA-3769691-2">

    <meta content="collector.githubapp.com" name="octolytics-host" /><meta content="collector-cdn.github.com" name="octolytics-script-host" /><meta content="github" name="octolytics-app-id" /><meta content="01CA3BFD:3B45:2AE4EA38:542B7BF0" name="octolytics-dimension-request_id" /><meta content="67733" name="octolytics-actor-id" /><meta content="xphan" name="octolytics-actor-login" /><meta content="f8c43c63a97cf3731e4cd4dd4b6a587f33c09fcc622aa655ef398215bb236193" name="octolytics-actor-hash" />
    <meta content="Rails, view, blob#show" name="analytics-event" />

    
    
    <link rel="icon" type="image/x-icon" href="https://assets-cdn.github.com/favicon.ico">


    <meta content="authenticity_token" name="csrf-param" />
<meta content="hrEYl6JqNoG456x6rxkZ1PIRW2WxWJ2IpbmRm0MnSEqI9YKE8hEhY15o0/+i0o14ZPPlAEZBTHxy7MJvFg3C+g==" name="csrf-token" />

    <link href="https://assets-cdn.github.com/assets/github-63471208691ae2d5efd3a89acb805c8edbe2da41.css" media="all" rel="stylesheet" type="text/css" />
    <link href="https://assets-cdn.github.com/assets/github2-9122f623c0a96f6f5b38397b305a6239b838041e.css" media="all" rel="stylesheet" type="text/css" />
    


    <meta http-equiv="x-pjax-version" content="7e925c3ca12dff2d5fb11f2e86831398">

      
  <meta name="description" content="Contribute to progfun-wiki development by creating an account on GitHub.">
  <meta name="go-import" content="github.com/lampepfl/progfun-wiki git https://github.com/lampepfl/progfun-wiki.git">

  <meta content="2684793" name="octolytics-dimension-user_id" /><meta content="lampepfl" name="octolytics-dimension-user_login" /><meta content="5371370" name="octolytics-dimension-repository_id" /><meta content="lampepfl/progfun-wiki" name="octolytics-dimension-repository_nwo" /><meta content="true" name="octolytics-dimension-repository_public" /><meta content="false" name="octolytics-dimension-repository_is_fork" /><meta content="5371370" name="octolytics-dimension-repository_network_root_id" /><meta content="lampepfl/progfun-wiki" name="octolytics-dimension-repository_network_root_nwo" />
  <link href="https://github.com/lampepfl/progfun-wiki/commits/gh-pages.atom" rel="alternate" title="Recent Commits to progfun-wiki:gh-pages" type="application/atom+xml">

  </head>


  <body class="logged_in  env-production windows vis-public page-blob">
    <a href="#start-of-content" tabindex="1" class="accessibility-aid js-skip-to-content">Skip to content</a>
    <div class="wrapper">
      
      
      
      


      <div class="header header-logged-in true" role="banner">
  <div class="container clearfix">

    <a class="header-logo-invertocat" href="https://github.com/" data-hotkey="g d" aria-label="Homepage" ga-data-click="Header, go to dashboard, icon:logo">
  <span class="mega-octicon octicon-mark-github"></span>
</a>


      <div class="site-search repo-scope js-site-search" role="search">
          <form accept-charset="UTF-8" action="/lampepfl/progfun-wiki/search" class="js-site-search-form" data-global-search-url="/search" data-repo-search-url="/lampepfl/progfun-wiki/search" method="get"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /></div>
  <input type="text"
    class="js-site-search-field is-clearable"
    data-hotkey="s"
    name="q"
    placeholder="Search"
    data-global-scope-placeholder="Search GitHub"
    data-repo-scope-placeholder="Search"
    tabindex="1"
    autocapitalize="off">
  <div class="scope-badge">This repository</div>
</form>
      </div>
      <ul class="header-nav left" role="navigation">
        <li class="header-nav-item explore">
          <a class="header-nav-link" href="/explore" data-ga-click="Header, go to explore, text:explore">Explore</a>
        </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="https://gist.github.com" data-ga-click="Header, go to gist, text:gist">Gist</a>
          </li>
          <li class="header-nav-item">
            <a class="header-nav-link" href="/blog" data-ga-click="Header, go to blog, text:blog">Blog</a>
          </li>
        <li class="header-nav-item">
          <a class="header-nav-link" href="https://help.github.com" data-ga-click="Header, go to help, text:help">Help</a>
        </li>
      </ul>

    
<ul class="header-nav user-nav right" id="user-links">
  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link name" href="/xphan" data-ga-click="Header, go to profile, text:username">
      <img alt="xphan" class="avatar" data-user="67733" height="20" src="https://avatars0.githubusercontent.com/u/67733?v=2&amp;s=40" width="20" />
      <span class="css-truncate">
        <span class="css-truncate-target">xphan</span>
      </span>
    </a>
  </li>

  <li class="header-nav-item dropdown js-menu-container">
    <a class="header-nav-link js-menu-target tooltipped tooltipped-s" href="#" aria-label="Create new..." data-ga-click="Header, create new, icon:add">
      <span class="octicon octicon-plus"></span>
      <span class="dropdown-caret"></span>
    </a>

    <div class="dropdown-menu-content js-menu-content">
      
<ul class="dropdown-menu">
  <li>
    <a href="/new"><span class="octicon octicon-repo"></span> New repository</a>
  </li>
  <li>
    <a href="/organizations/new"><span class="octicon octicon-organization"></span> New organization</a>
  </li>


</ul>

    </div>
  </li>

  <li class="header-nav-item">
        <a href="/notifications" aria-label="You have no unread notifications" class="header-nav-link notification-indicator tooltipped tooltipped-s" data-ga-click="Header, go to notifications, icon:read" data-hotkey="g n">
        <span class="mail-status all-read"></span>
        <span class="octicon octicon-inbox"></span>
</a>
  </li>

  <li class="header-nav-item">
    <a class="header-nav-link tooltipped tooltipped-s" href="/settings/profile" id="account_settings" aria-label="Settings" data-ga-click="Header, go to settings, icon:settings">
      <span class="octicon octicon-gear"></span>
    </a>
  </li>

  <li class="header-nav-item">
    <form accept-charset="UTF-8" action="/logout" class="logout-form" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="ATMhn5SLXTq4RLCM6vvQ8dlMXoC5yclvxTZGGeuteF7XBK73d8jOONH4YdnyKUMc0fKZJ+Kc0UnbT0e2IT2wgQ==" /></div>
      <button class="header-nav-link sign-out-button tooltipped tooltipped-s" aria-label="Sign out" data-ga-click="Header, sign out, icon:logout">
        <span class="octicon octicon-sign-out"></span>
      </button>
</form>  </li>

</ul>


    
  </div>
</div>

      

        


      <div id="start-of-content" class="accessibility-aid"></div>
          <div class="site" itemscope itemtype="http://schema.org/WebPage">
    <div id="js-flash-container">
      
    </div>
    <div class="pagehead repohead instapaper_ignore readability-menu">
      <div class="container">
        
<ul class="pagehead-actions">

    <li class="subscription">
      <form accept-charset="UTF-8" action="/notifications/subscribe" class="js-social-container" data-autosubmit="true" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="IdLANoJqyDp4JZK2feqByAJM605PdS0/gUCL3E+XxoS70r7+XUrNwvdibUM1ga9UFKgcOuFw0mIBLCcA4gmLKw==" /></div>  <input id="repository_id" name="repository_id" type="hidden" value="5371370" />

    <div class="select-menu js-menu-container js-select-menu">
      <a class="social-count js-social-count" href="/lampepfl/progfun-wiki/watchers">
        45
      </a>
      <a href="/lampepfl/progfun-wiki/subscription"
        class="minibutton select-menu-button with-count js-menu-target" role="button" tabindex="0" aria-haspopup="true">
        <span class="js-select-button">
          <span class="octicon octicon-eye"></span>
          Watch
        </span>
      </a>

      <div class="select-menu-modal-holder">
        <div class="select-menu-modal subscription-menu-modal js-menu-content" aria-hidden="true">
          <div class="select-menu-header">
            <span class="select-menu-title">Notifications</span>
            <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
          </div> <!-- /.select-menu-header -->

          <div class="select-menu-list js-navigation-container" role="menu">

            <div class="select-menu-item js-navigation-item selected" role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input checked="checked" id="do_included" name="do" type="radio" value="included" />
                <h4>Not watching</h4>
                <span class="description">Be notified when participating or @mentioned.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye"></span>
                  Watch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_subscribed" name="do" type="radio" value="subscribed" />
                <h4>Watching</h4>
                <span class="description">Be notified of all conversations.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-eye"></span>
                  Unwatch
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

            <div class="select-menu-item js-navigation-item " role="menuitem" tabindex="0">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <div class="select-menu-item-text">
                <input id="do_ignore" name="do" type="radio" value="ignore" />
                <h4>Ignoring</h4>
                <span class="description">Never be notified.</span>
                <span class="js-select-button-text hidden-select-button-text">
                  <span class="octicon octicon-mute"></span>
                  Stop ignoring
                </span>
              </div>
            </div> <!-- /.select-menu-item -->

          </div> <!-- /.select-menu-list -->

        </div> <!-- /.select-menu-modal -->
      </div> <!-- /.select-menu-modal-holder -->
    </div> <!-- /.select-menu -->

</form>
    </li>

  <li>
    
  <div class="js-toggler-container js-social-container starring-container on">

    <form accept-charset="UTF-8" action="/lampepfl/progfun-wiki/unstar" class="js-toggler-form starred js-unstar-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="7B9IsDCxfXYC6vgTUoeoLgbO8bmolRFfLRMvOkH/c56B55RTeWp8hUmzyYiZjzLO8roD19aiN0fWQoU970E1OA==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Unstar this repository" title="Unstar lampepfl/progfun-wiki">
        <span class="octicon octicon-star"></span>
        Unstar
      </button>
        <a class="social-count js-social-count" href="/lampepfl/progfun-wiki/stargazers">
          237
        </a>
</form>
    <form accept-charset="UTF-8" action="/lampepfl/progfun-wiki/star" class="js-toggler-form unstarred js-star-button" data-remote="true" method="post"><div style="margin:0;padding:0;display:inline"><input name="utf8" type="hidden" value="&#x2713;" /><input name="authenticity_token" type="hidden" value="ZsIoniHuJtfIzIu9H7QsRmTLHgsD8eGiWSCnAaOVE620TDcO9xK8QiFWgiNHqHr8GtP1wbOcvzRmPeTI2QzNBg==" /></div>
      <button
        class="minibutton with-count js-toggler-target star-button"
        aria-label="Star this repository" title="Star lampepfl/progfun-wiki">
        <span class="octicon octicon-star"></span>
        Star
      </button>
        <a class="social-count js-social-count" href="/lampepfl/progfun-wiki/stargazers">
          237
        </a>
</form>  </div>

  </li>


        <li>
          <a href="/lampepfl/progfun-wiki/fork" class="minibutton with-count js-toggler-target fork-button tooltipped-n" title="Fork your own copy of lampepfl/progfun-wiki to your account" aria-label="Fork your own copy of lampepfl/progfun-wiki to your account" rel="nofollow" data-method="post">
            <span class="octicon octicon-repo-forked"></span>
            Fork
          </a>
          <a href="/lampepfl/progfun-wiki/network" class="social-count">263</a>
        </li>

</ul>

        <h1 itemscope itemtype="http://data-vocabulary.org/Breadcrumb" class="entry-title public">
          <span class="mega-octicon octicon-repo"></span>
          <span class="author"><a href="/lampepfl" class="url fn" itemprop="url" rel="author"><span itemprop="title">lampepfl</span></a></span><!--
       --><span class="path-divider">/</span><!--
       --><strong><a href="/lampepfl/progfun-wiki" class="js-current-repository js-repo-home-link">progfun-wiki</a></strong>

          <span class="page-context-loader">
            <img alt="" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
          </span>

        </h1>
      </div><!-- /.container -->
    </div><!-- /.repohead -->

    <div class="container">
      <div class="repository-with-sidebar repo-container new-discussion-timeline  ">
        <div class="repository-sidebar clearfix">
            
<div class="sunken-menu vertical-right repo-nav js-repo-nav js-repository-container-pjax js-octicon-loaders" role="navigation" data-issue-count-url="/lampepfl/progfun-wiki/issues/counts">
  <div class="sunken-menu-contents">
    <ul class="sunken-menu-group">
      <li class="tooltipped tooltipped-w" aria-label="Code">
        <a href="/lampepfl/progfun-wiki" aria-label="Code" class="selected js-selected-navigation-item sunken-menu-item" data-hotkey="g c" data-pjax="true" data-selected-links="repo_source repo_downloads repo_commits repo_releases repo_tags repo_branches /lampepfl/progfun-wiki">
          <span class="octicon octicon-code"></span> <span class="full-word">Code</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


      <li class="tooltipped tooltipped-w" aria-label="Pull Requests">
        <a href="/lampepfl/progfun-wiki/pulls" aria-label="Pull Requests" class="js-selected-navigation-item sunken-menu-item js-disable-pjax" data-hotkey="g p" data-selected-links="repo_pulls /lampepfl/progfun-wiki/pulls">
            <span class="octicon octicon-git-pull-request"></span> <span class="full-word">Pull Requests</span>
            <span class="js-pull-replace-counter"></span>
            <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>


    </ul>
    <div class="sunken-menu-separator"></div>
    <ul class="sunken-menu-group">

      <li class="tooltipped tooltipped-w" aria-label="Pulse">
        <a href="/lampepfl/progfun-wiki/pulse/weekly" aria-label="Pulse" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="pulse /lampepfl/progfun-wiki/pulse/weekly">
          <span class="octicon octicon-pulse"></span> <span class="full-word">Pulse</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>

      <li class="tooltipped tooltipped-w" aria-label="Graphs">
        <a href="/lampepfl/progfun-wiki/graphs" aria-label="Graphs" class="js-selected-navigation-item sunken-menu-item" data-pjax="true" data-selected-links="repo_graphs repo_contributors /lampepfl/progfun-wiki/graphs">
          <span class="octicon octicon-graph"></span> <span class="full-word">Graphs</span>
          <img alt="" class="mini-loader" height="16" src="https://assets-cdn.github.com/images/spinners/octocat-spinner-32.gif" width="16" />
</a>      </li>
    </ul>


  </div>
</div>

              <div class="only-with-full-nav">
                
  
<div class="clone-url open"
  data-protocol-type="http"
  data-url="/users/set_protocol?protocol_selector=http&amp;protocol_type=clone">
  <h3><span class="text-emphasized">HTTPS</span> clone URL</h3>
  <div class="input-group">
    <input type="text" class="input-mini input-monospace js-url-field"
           value="https://github.com/lampepfl/progfun-wiki.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/lampepfl/progfun-wiki.git" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="ssh"
  data-url="/users/set_protocol?protocol_selector=ssh&amp;protocol_type=clone">
  <h3><span class="text-emphasized">SSH</span> clone URL</h3>
  <div class="input-group">
    <input type="text" class="input-mini input-monospace js-url-field"
           value="git@github.com:lampepfl/progfun-wiki.git" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="git@github.com:lampepfl/progfun-wiki.git" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>

  
<div class="clone-url "
  data-protocol-type="subversion"
  data-url="/users/set_protocol?protocol_selector=subversion&amp;protocol_type=clone">
  <h3><span class="text-emphasized">Subversion</span> checkout URL</h3>
  <div class="input-group">
    <input type="text" class="input-mini input-monospace js-url-field"
           value="https://github.com/lampepfl/progfun-wiki" readonly="readonly">
    <span class="input-group-button">
      <button aria-label="Copy to clipboard" class="js-zeroclipboard minibutton zeroclipboard-button" data-clipboard-text="https://github.com/lampepfl/progfun-wiki" data-copied-hint="Copied!" type="button"><span class="octicon octicon-clippy"></span></button>
    </span>
  </div>
</div>


<p class="clone-options">You can clone with
      <a href="#" class="js-clone-selector" data-protocol="http">HTTPS</a>,
      <a href="#" class="js-clone-selector" data-protocol="ssh">SSH</a>,
      or <a href="#" class="js-clone-selector" data-protocol="subversion">Subversion</a>.
  <a href="https://help.github.com/articles/which-remote-url-should-i-use" class="help tooltipped tooltipped-n" aria-label="Get help on which URL is right for you.">
    <span class="octicon octicon-question"></span>
  </a>
</p>


  <a href="github-windows://openRepo/https://github.com/lampepfl/progfun-wiki" class="minibutton sidebar-button" title="Save lampepfl/progfun-wiki to your computer and use it in GitHub Desktop." aria-label="Save lampepfl/progfun-wiki to your computer and use it in GitHub Desktop.">
    <span class="octicon octicon-device-desktop"></span>
    Clone in Desktop
  </a>

                <a href="/lampepfl/progfun-wiki/archive/gh-pages.zip"
                   class="minibutton sidebar-button"
                   aria-label="Download the contents of lampepfl/progfun-wiki as a zip file"
                   title="Download the contents of lampepfl/progfun-wiki as a zip file"
                   rel="nofollow">
                  <span class="octicon octicon-cloud-download"></span>
                  Download ZIP
                </a>
              </div>
        </div><!-- /.repository-sidebar -->

        <div id="js-repo-pjax-container" class="repository-content context-loader-container" data-pjax-container>
          

<a href="/lampepfl/progfun-wiki/blob/e03584159c19da9a40de96f6697a2636dad8632d/CheatSheet.md" class="hidden js-permalink-shortcut" data-hotkey="y">Permalink</a>

<!-- blob contrib key: blob_contributors:v21:18dda497e711ec81af3482e42ca7242e -->

<div class="file-navigation">
  
<div class="select-menu js-menu-container js-select-menu left">
  <span class="minibutton select-menu-button js-menu-target css-truncate" data-hotkey="w"
    data-master-branch="gh-pages"
    data-ref="gh-pages"
    title="gh-pages"
    role="button" aria-label="Switch branches or tags" tabindex="0" aria-haspopup="true">
    <span class="octicon octicon-git-branch"></span>
    <i>branch:</i>
    <span class="js-select-button css-truncate-target">gh-pages</span>
  </span>

  <div class="select-menu-modal-holder js-menu-content js-navigation-container" data-pjax aria-hidden="true">

    <div class="select-menu-modal">
      <div class="select-menu-header">
        <span class="select-menu-title">Switch branches/tags</span>
        <span class="octicon octicon-x js-menu-close" role="button" aria-label="Close"></span>
      </div> <!-- /.select-menu-header -->

      <div class="select-menu-filters">
        <div class="select-menu-text-filter">
          <input type="text" aria-label="Filter branches/tags" id="context-commitish-filter-field" class="js-filterable-field js-navigation-enable" placeholder="Filter branches/tags">
        </div>
        <div class="select-menu-tabs">
          <ul>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="branches" class="js-select-menu-tab">Branches</a>
            </li>
            <li class="select-menu-tab">
              <a href="#" data-tab-filter="tags" class="js-select-menu-tab">Tags</a>
            </li>
          </ul>
        </div><!-- /.select-menu-tabs -->
      </div><!-- /.select-menu-filters -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="branches">

        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


            <div class="select-menu-item js-navigation-item selected">
              <span class="select-menu-item-icon octicon octicon-check"></span>
              <a href="/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md"
                 data-name="gh-pages"
                 data-skip-pjax="true"
                 rel="nofollow"
                 class="js-navigation-open select-menu-item-text css-truncate-target"
                 title="gh-pages">gh-pages</a>
            </div> <!-- /.select-menu-item -->
        </div>

          <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

      <div class="select-menu-list select-menu-tab-bucket js-select-menu-tab-bucket" data-tab-filter="tags">
        <div data-filterable-for="context-commitish-filter-field" data-filterable-type="substring">


        </div>

        <div class="select-menu-no-results">Nothing to show</div>
      </div> <!-- /.select-menu-list -->

    </div> <!-- /.select-menu-modal -->
  </div> <!-- /.select-menu-modal-holder -->
</div> <!-- /.select-menu -->

  <div class="button-group right">
    <a href="/lampepfl/progfun-wiki/find/gh-pages"
          class="js-show-file-finder minibutton empty-icon tooltipped tooltipped-s"
          data-pjax
          data-hotkey="t"
          aria-label="Quickly jump between files">
      <span class="octicon octicon-list-unordered"></span>
    </a>
    <button class="js-zeroclipboard minibutton zeroclipboard-button"
          data-clipboard-text="CheatSheet.md"
          aria-label="Copy to clipboard"
          data-copied-hint="Copied!">
      <span class="octicon octicon-clippy"></span>
    </button>
  </div>

  <div class="breadcrumb">
    <span class='repo-root js-repo-root'><span itemscope="" itemtype="http://data-vocabulary.org/Breadcrumb"><a href="/lampepfl/progfun-wiki" class="" data-branch="gh-pages" data-direction="back" data-pjax="true" itemscope="url"><span itemprop="title">progfun-wiki</span></a></span></span><span class="separator"> / </span><strong class="final-path">CheatSheet.md</strong>
  </div>
</div>


  <div class="commit file-history-tease">
    <div class="file-history-tease-header">
        <img alt="Lukas Rytz" class="avatar" data-user="119636" height="24" src="https://avatars3.githubusercontent.com/u/119636?v=2&amp;s=48" width="24" />
        <span class="author"><a href="/lrytz" rel="contributor">lrytz</a></span>
        <time datetime="2014-04-28T09:41:52+02:00" is="relative-time">April 28, 2014</time>
        <div class="commit-title">
            <a href="/lampepfl/progfun-wiki/commit/e03584159c19da9a40de96f6697a2636dad8632d" class="message" data-pjax="true" title="move wiki to lampepfl">move wiki to lampepfl</a>
        </div>
    </div>

    <div class="participation">
      <p class="quickstat">
        <a href="#blob_contributors_box" rel="facebox">
          <strong>17</strong>
           contributors
        </a>
      </p>
          <a class="avatar-link tooltipped tooltipped-s" aria-label="gzm0" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=gzm0"><img alt="Tobias Schlatter" class="avatar" data-user="1140323" height="20" src="https://avatars2.githubusercontent.com/u/1140323?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="lrytz" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=lrytz"><img alt="Lukas Rytz" class="avatar" data-user="119636" height="20" src="https://avatars1.githubusercontent.com/u/119636?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="ktully" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=ktully"><img alt="Kieran Tully" class="avatar" data-user="2602832" height="20" src="https://avatars2.githubusercontent.com/u/2602832?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="lpoulain" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=lpoulain"><img alt="lpoulain" class="avatar" data-user="2676310" height="20" src="https://avatars2.githubusercontent.com/u/2676310?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="apbarrero" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=apbarrero"><img alt="Antonio Pérez Barrero" class="avatar" data-user="1088202" height="20" src="https://avatars2.githubusercontent.com/u/1088202?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="jokster" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=jokster"><img alt="jokster" class="avatar" data-user="3968675" height="20" src="https://avatars3.githubusercontent.com/u/3968675?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="nikai3d" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=nikai3d"><img alt="Nicolas Kaiser" class="avatar" data-user="494755" height="20" src="https://avatars1.githubusercontent.com/u/494755?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="roryokane" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=roryokane"><img alt="Rory O’Kane" class="avatar" data-user="79168" height="20" src="https://avatars3.githubusercontent.com/u/79168?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="kowaliszyn" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=kowaliszyn"><img alt="michal" class="avatar" data-user="1754664" height="20" src="https://avatars3.githubusercontent.com/u/1754664?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="hugueschabot" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=hugueschabot"><img alt="Hugues Chabot" class="avatar" data-user="1215723" height="20" src="https://avatars2.githubusercontent.com/u/1215723?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="BafS" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=BafS"><img alt="Fabien Sa" class="avatar" data-user="588205" height="20" src="https://avatars2.githubusercontent.com/u/588205?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="dmakhno" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=dmakhno"><img alt="Dmytro Makhno" class="avatar" data-user="1913863" height="20" src="https://avatars2.githubusercontent.com/u/1913863?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="DanyUP" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=DanyUP"><img alt="DanyUP" class="avatar" data-user="1170998" height="20" src="https://avatars3.githubusercontent.com/u/1170998?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="davidallsopp" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=davidallsopp"><img alt="David Allsopp" class="avatar" data-user="5507886" height="20" src="https://avatars3.githubusercontent.com/u/5507886?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="carsten-j" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=carsten-j"><img alt="Carsten Jørgensen" class="avatar" data-user="2677833" height="20" src="https://avatars3.githubusercontent.com/u/2677833?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="ebolinger" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=ebolinger"><img alt="ebolinger" class="avatar" data-user="984255" height="20" src="https://avatars3.githubusercontent.com/u/984255?v=2&amp;s=40" width="20" /></a>
    <a class="avatar-link tooltipped tooltipped-s" aria-label="vladm123" href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md?author=vladm123"><img alt="Vlad Manea" class="avatar" data-user="572068" height="20" src="https://avatars2.githubusercontent.com/u/572068?v=2&amp;s=40" width="20" /></a>


    </div>
    <div id="blob_contributors_box" style="display:none">
      <h2 class="facebox-header">Users who have contributed to this file</h2>
      <ul class="facebox-user-list">
          <li class="facebox-user-list-item">
            <img alt="Tobias Schlatter" data-user="1140323" height="24" src="https://avatars0.githubusercontent.com/u/1140323?v=2&amp;s=48" width="24" />
            <a href="/gzm0">gzm0</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Lukas Rytz" data-user="119636" height="24" src="https://avatars3.githubusercontent.com/u/119636?v=2&amp;s=48" width="24" />
            <a href="/lrytz">lrytz</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Kieran Tully" data-user="2602832" height="24" src="https://avatars0.githubusercontent.com/u/2602832?v=2&amp;s=48" width="24" />
            <a href="/ktully">ktully</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="lpoulain" data-user="2676310" height="24" src="https://avatars0.githubusercontent.com/u/2676310?v=2&amp;s=48" width="24" />
            <a href="/lpoulain">lpoulain</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Antonio Pérez Barrero" data-user="1088202" height="24" src="https://avatars0.githubusercontent.com/u/1088202?v=2&amp;s=48" width="24" />
            <a href="/apbarrero">apbarrero</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="jokster" data-user="3968675" height="24" src="https://avatars1.githubusercontent.com/u/3968675?v=2&amp;s=48" width="24" />
            <a href="/jokster">jokster</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Nicolas Kaiser" data-user="494755" height="24" src="https://avatars3.githubusercontent.com/u/494755?v=2&amp;s=48" width="24" />
            <a href="/nikai3d">nikai3d</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Rory O’Kane" data-user="79168" height="24" src="https://avatars1.githubusercontent.com/u/79168?v=2&amp;s=48" width="24" />
            <a href="/roryokane">roryokane</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="michal" data-user="1754664" height="24" src="https://avatars1.githubusercontent.com/u/1754664?v=2&amp;s=48" width="24" />
            <a href="/kowaliszyn">kowaliszyn</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Hugues Chabot" data-user="1215723" height="24" src="https://avatars0.githubusercontent.com/u/1215723?v=2&amp;s=48" width="24" />
            <a href="/hugueschabot">hugueschabot</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Fabien Sa" data-user="588205" height="24" src="https://avatars0.githubusercontent.com/u/588205?v=2&amp;s=48" width="24" />
            <a href="/BafS">BafS</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Dmytro Makhno" data-user="1913863" height="24" src="https://avatars0.githubusercontent.com/u/1913863?v=2&amp;s=48" width="24" />
            <a href="/dmakhno">dmakhno</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="DanyUP" data-user="1170998" height="24" src="https://avatars1.githubusercontent.com/u/1170998?v=2&amp;s=48" width="24" />
            <a href="/DanyUP">DanyUP</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="David Allsopp" data-user="5507886" height="24" src="https://avatars1.githubusercontent.com/u/5507886?v=2&amp;s=48" width="24" />
            <a href="/davidallsopp">davidallsopp</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Carsten Jørgensen" data-user="2677833" height="24" src="https://avatars1.githubusercontent.com/u/2677833?v=2&amp;s=48" width="24" />
            <a href="/carsten-j">carsten-j</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="ebolinger" data-user="984255" height="24" src="https://avatars1.githubusercontent.com/u/984255?v=2&amp;s=48" width="24" />
            <a href="/ebolinger">ebolinger</a>
          </li>
          <li class="facebox-user-list-item">
            <img alt="Vlad Manea" data-user="572068" height="24" src="https://avatars0.githubusercontent.com/u/572068?v=2&amp;s=48" width="24" />
            <a href="/vladm123">vladm123</a>
          </li>
      </ul>
    </div>
  </div>

<div class="file-box">
  <div class="file">
    <div class="meta clearfix">
      <div class="info file-name">
          <span>472 lines (373 sloc)</span>
          <span class="meta-divider"></span>
        <span>18.847 kb</span>
      </div>
      <div class="actions">
        <div class="button-group">
          <a href="/lampepfl/progfun-wiki/raw/gh-pages/CheatSheet.md" class="minibutton " id="raw-url">Raw</a>
            <a href="/lampepfl/progfun-wiki/blame/gh-pages/CheatSheet.md" class="minibutton js-update-url-with-hash">Blame</a>
          <a href="/lampepfl/progfun-wiki/commits/gh-pages/CheatSheet.md" class="minibutton " rel="nofollow">History</a>
        </div><!-- /.button-group -->

          <a class="octicon-button tooltipped tooltipped-nw"
             href="github-windows://openRepo/https://github.com/lampepfl/progfun-wiki?branch=gh-pages&amp;filepath=CheatSheet.md" aria-label="Open this file in GitHub for Windows">
              <span class="octicon octicon-device-desktop"></span>
          </a>

              <a class="octicon-button tooltipped tooltipped-n js-update-url-with-hash"
                 aria-label="Clicking this button will fork this project so you can edit the file"
                 href="/lampepfl/progfun-wiki/edit/gh-pages/CheatSheet.md"
                 data-method="post" rel="nofollow"><span class="octicon octicon-pencil"></span></a>

            <a class="octicon-button danger tooltipped tooltipped-s"
               href="/lampepfl/progfun-wiki/delete/gh-pages/CheatSheet.md"
               aria-label="Fork this project and delete file"
               data-method="post" data-test-id="delete-blob-file" rel="nofollow">
          <span class="octicon octicon-trashcan"></span>
        </a>
      </div><!-- /.actions -->
    </div>
      <div id="readme" class="blob instapaper_body">
    <article class="markdown-body entry-content" itemprop="mainContentOfPage"><table>
<thead><tr>
<th>layout</th>

  <th>title</th>
  </tr></thead>
<tbody><tr>
<td><div>page</div></td>

  <td><div>Cheat Sheet</div></td>
  </tr></tbody>
</table><p>This cheat sheet originated from the forum, credits to Laurent Poulain.
We copied it and changed or added a few things.
There are certainly a lot of things that can be improved! If you would like to contribute, you have two options:</p>

<ul class="task-list">
<li><p>Click the "Edit" button on this file on GitHub:<br><a href="https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md">https://github.com/lampepfl/progfun-wiki/blob/gh-pages/CheatSheet.md</a><br>
You can submit a pull request directly from there without checking out the git repository to your local machine.</p></li>
<li><p>Fork the repository <a href="https://github.com/lampepfl/progfun-wiki">https://github.com/lampepfl/progfun-wiki</a> and check it out locally. To preview your changes, you need <a href="http://jekyllrb.com/">jekyll</a>. Navigate to your checkout and invoke <code>jekyll serve</code>, then open the page <a href="http://localhost:4000/CheatSheet.html">http://localhost:4000/CheatSheet.html</a>.</p></li>
</ul><h2>
<a name="user-content-evaluation-rules" class="anchor" href="#evaluation-rules" aria-hidden="true"><span class="octicon octicon-link"></span></a>Evaluation Rules</h2>

<ul class="task-list">
<li>Call by value: evaluates the function arguments before calling the function</li>
<li>Call by name: evaluates the function first, and then evaluates the arguments if need be</li>
</ul><div class="highlight highlight-scala"><pre>    <span class="k">def</span> <span class="n">example</span> <span class="k">=</span> <span class="mi">2</span>      <span class="c1">// evaluated when called</span>
    <span class="k">val</span> <span class="n">example</span> <span class="k">=</span> <span class="mi">2</span>      <span class="c1">// evaluated immediately</span>
    <span class="k">lazy</span> <span class="k">val</span> <span class="n">example</span> <span class="k">=</span> <span class="mi">2</span> <span class="c1">// evaluated once when needed</span>

    <span class="k">def</span> <span class="n">square</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Double</span><span class="o">)</span>    <span class="c1">// call by value</span>
    <span class="k">def</span> <span class="n">square</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="o">=&gt;</span> <span class="nc">Double</span><span class="o">)</span> <span class="c1">// call by name</span>
    <span class="k">def</span> <span class="n">myFct</span><span class="o">(</span><span class="n">bindings</span><span class="k">:</span> <span class="kt">Int*</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// bindings is a sequence of int, containing a varying # of arguments</span>
</pre></div>

<h2>
<a name="user-content-higher-order-functions" class="anchor" href="#higher-order-functions" aria-hidden="true"><span class="octicon octicon-link"></span></a>Higher order functions</h2>

<p>These are functions that take a function as a parameter or return functions.</p>

<div class="highlight highlight-scala"><pre>    <span class="c1">// sum() returns a function that takes two integers and returns an integer  </span>
    <span class="k">def</span> <span class="n">sum</span><span class="o">(</span><span class="n">f</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=&gt;</span> <span class="nc">Int</span><span class="o">)</span><span class="k">:</span> <span class="o">(</span><span class="kt">Int</span><span class="o">,</span> <span class="kt">Int</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="nc">Int</span> <span class="k">=</span> <span class="o">{</span>  
      <span class="k">def</span> <span class="n">sumf</span><span class="o">(</span><span class="n">a</span><span class="k">:</span> <span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{...}</span>  
      <span class="n">sumf</span>  
    <span class="o">}</span> 

    <span class="c1">// same as above. Its type is (Int =&gt; Int) =&gt; (Int, Int) =&gt; Int  </span>
    <span class="k">def</span> <span class="n">sum</span><span class="o">(</span><span class="n">f</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=&gt;</span> <span class="nc">Int</span><span class="o">)(</span><span class="n">a</span><span class="k">:</span> <span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> 

    <span class="c1">// Called like this</span>
    <span class="n">sum</span><span class="o">((</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span><span class="o">)</span>          <span class="c1">// Anonymous function, i.e. does not have a name  </span>
    <span class="n">sum</span><span class="o">(</span><span class="n">x</span> <span class="k">=&gt;</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span><span class="o">)</span>                 <span class="c1">// Same anonymous function with type inferred</span>

    <span class="k">def</span> <span class="n">cube</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span> <span class="k">=</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span>  
    <span class="n">sum</span><span class="o">(</span><span class="n">x</span> <span class="k">=&gt;</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span> <span class="o">*</span> <span class="n">x</span><span class="o">)(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">10</span><span class="o">)</span> <span class="c1">// sum of cubes from 1 to 10</span>
    <span class="n">sum</span><span class="o">(</span><span class="n">cube</span><span class="o">)(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">10</span><span class="o">)</span>           <span class="c1">// same as above      </span>
</pre></div>

<h2>
<a name="user-content-currying" class="anchor" href="#currying" aria-hidden="true"><span class="octicon octicon-link"></span></a>Currying</h2>

<p>Converting a function with multiple arguments into a function with a
single argument that returns another function.</p>

<div class="highlight highlight-scala"><pre>    <span class="k">def</span> <span class="n">f</span><span class="o">(</span><span class="n">a</span><span class="k">:</span> <span class="kt">Int</span><span class="o">,</span> <span class="n">b</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="c1">// uncurried version (type is (Int, Int) =&gt; Int)</span>
    <span class="k">def</span> <span class="n">f</span><span class="o">(</span><span class="n">a</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)(</span><span class="n">b</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="c1">// curried version (type is Int =&gt; Int =&gt; Int)</span>
</pre></div>

<h2>
<a name="user-content-classes" class="anchor" href="#classes" aria-hidden="true"><span class="octicon octicon-link"></span></a>Classes</h2>

<div class="highlight highlight-scala"><pre>    <span class="k">class</span> <span class="nc">MyClass</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">,</span> <span class="n">y</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span> <span class="o">{</span>           <span class="c1">// Defines a new type MyClass with a constructor  </span>
      <span class="n">require</span><span class="o">(</span><span class="n">y</span> <span class="o">&gt;</span> <span class="mi">0</span><span class="o">,</span> <span class="s">"y must be positive"</span><span class="o">)</span>    <span class="c1">// precondition, triggering an IllegalArgumentException if not met  </span>
      <span class="k">def</span> <span class="k">this</span> <span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>             <span class="c1">// auxiliary constructor   </span>
      <span class="k">def</span> <span class="n">nb1</span> <span class="k">=</span> <span class="n">x</span>                             <span class="c1">// public method computed every time it is called  </span>
      <span class="k">def</span> <span class="n">nb2</span> <span class="k">=</span> <span class="n">y</span>  
      <span class="k">private</span> <span class="k">def</span> <span class="n">test</span><span class="o">(</span><span class="n">a</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// private method  </span>
      <span class="k">val</span> <span class="n">nb3</span> <span class="k">=</span> <span class="n">x</span> <span class="o">+</span> <span class="n">y</span>                         <span class="c1">// computed only once  </span>
      <span class="k">override</span> <span class="k">def</span> <span class="n">toString</span> <span class="k">=</span>                 <span class="c1">// overridden method  </span>
          <span class="n">member1</span> <span class="o">+</span> <span class="s">", "</span> <span class="o">+</span> <span class="n">member2</span> 
    <span class="o">}</span>

    <span class="k">new</span> <span class="nc">MyClass</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">)</span> <span class="c1">// creates a new object of type</span>
</pre></div>

<p><code>this</code> references the current object, <code>assert(&lt;condition&gt;)</code> issues <code>AssertionError</code> if condition
is not met. See <code>scala.Predef</code> for <code>require</code>, <code>assume</code> and <code>assert</code>.</p>

<h2>
<a name="user-content-operators" class="anchor" href="#operators" aria-hidden="true"><span class="octicon octicon-link"></span></a>Operators</h2>

<p><code>myObject myMethod 1</code> is the same as calling <code>myObject.myMethod(1)</code></p>

<p>Operator (i.e. function) names can be alphanumeric, symbolic (e.g. <code>x1</code>, <code>*</code>, <code>+?%&amp;</code>, <code>vector_++</code>, <code>counter_=</code>)</p>

<p>The precedence of an operator is determined by its first character, with the following increasing order of priority:</p>

<pre><code>(all letters)
|
^
&amp;
&lt; &gt;
= !
:
+ -
* / %
(all other special characters)
</code></pre>

<p>The associativity of an operator is determined by its last character: Right-associative if ending with <code>:</code>, Left-associative otherwise.</p>

<p>Note that assignment operators have lowest precedence. (Read Scala Language Specification 2.9 sections 6.12.3, 6.12.4 for more info)</p>

<h2>
<a name="user-content-class-hierarchies" class="anchor" href="#class-hierarchies" aria-hidden="true"><span class="octicon octicon-link"></span></a>Class hierarchies</h2>

<div class="highlight highlight-scala"><pre>    <span class="k">abstract</span> <span class="k">class</span> <span class="nc">TopLevel</span> <span class="o">{</span>    <span class="c1">// abstract class  </span>
      <span class="k">def</span> <span class="n">method1</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span>   <span class="c1">// abstract method  </span>
      <span class="k">def</span> <span class="n">method2</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>  
    <span class="o">}</span>

    <span class="k">class</span> <span class="nc">Level1</span> <span class="k">extends</span> <span class="nc">TopLevel</span> <span class="o">{</span>  
      <span class="k">def</span> <span class="n">method1</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>  
      <span class="k">override</span> <span class="k">def</span> <span class="n">method2</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">Int</span><span class="o">)</span><span class="k">:</span> <span class="kt">Int</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...}</span> <span class="c1">// TopLevel's method2 needs to be explicitly overridden  </span>
    <span class="o">}</span>

    <span class="k">object</span> <span class="nc">MyObject</span> <span class="k">extends</span> <span class="nc">TopLevel</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// defines a singleton object. No other instance can be created</span>
</pre></div>

<p>To create a runnable application in Scala:</p>

<div class="highlight highlight-scala"><pre>    <span class="k">object</span> <span class="nc">Hello</span> <span class="o">{</span>  
      <span class="k">def</span> <span class="n">main</span><span class="o">(</span><span class="n">args</span><span class="k">:</span> <span class="kt">Array</span><span class="o">[</span><span class="kt">String</span><span class="o">])</span> <span class="k">=</span> <span class="n">println</span><span class="o">(</span><span class="s">"Hello world"</span><span class="o">)</span>  
    <span class="o">}</span>
</pre></div>

<p>or</p>

<div class="highlight highlight-scala"><pre>    <span class="k">object</span> <span class="nc">Hello</span> <span class="k">extends</span> <span class="nc">App</span> <span class="o">{</span>
      <span class="n">println</span><span class="o">(</span><span class="s">"Hello World"</span><span class="o">)</span>
    <span class="o">}</span>
</pre></div>

<h2>
<a name="user-content-class-organization" class="anchor" href="#class-organization" aria-hidden="true"><span class="octicon octicon-link"></span></a>Class Organization</h2>

<ul class="task-list">
<li><p>Classes and objects are organized in packages (<code>package myPackage</code>).</p></li>
<li><p>They can be referenced through import statements (<code>import myPackage.MyClass</code>, <code>import myPackage._</code>,
<code>import myPackage.{MyClass1, MyClass2}</code>, <code>import myPackage.{MyClass1 =&gt; A}</code>)</p></li>
<li><p>They can also be directly referenced in the code with the fully qualified name (<code>new myPackage.MyClass1</code>)</p></li>
<li><p>All members of packages <code>scala</code> and <code>java.lang</code> as well as all members of the object <code>scala.Predef</code> are automatically imported.</p></li>
<li><p>Traits are similar to Java interfaces, except they can have non-abstract members:</p></li>
</ul><div class="highlight highlight-scala"><pre>        <span class="k">trait</span> <span class="nc">Planar</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>
        <span class="k">class</span> <span class="nc">Square</span> <span class="k">extends</span> <span class="nc">Shape</span> <span class="k">with</span> <span class="nc">Planar</span>
</pre></div>

<ul class="task-list">
<li>
<p>General object hierarchy:</p>

<ul class="task-list">
<li>
<code>scala.Any</code> base type of all types. Has methods <code>hashCode</code> and <code>toString</code> that can be overloaded</li>
<li>
<code>scala.AnyVal</code> base type of all primitive types. (<code>scala.Double</code>, <code>scala.Float</code>, etc.)</li>
<li>
<code>scala.AnyRef</code> base type of all reference types. (alias of <code>java.lang.Object</code>, supertype of <code>java.lang.String</code>, <code>scala.List</code>, any user-defined class)</li>
<li>
<code>scala.Null</code> is a subtype of any <code>scala.AnyRef</code> (<code>null</code> is the only instance of type <code>Null</code>), and <code>scala.Nothing</code> is a subtype of any other type without any instance.</li>
</ul>
</li>
</ul><h2>
<a name="user-content-type-parameters" class="anchor" href="#type-parameters" aria-hidden="true"><span class="octicon octicon-link"></span></a>Type Parameters</h2>

<p>Conceptually similar to C++ templates or Java generics. These can apply to classes, traits or functions.</p>

<div class="highlight highlight-scala"><pre>    <span class="k">class</span> <span class="nc">MyClass</span><span class="o">[</span><span class="kt">T</span><span class="o">](</span><span class="n">arg1</span><span class="k">:</span> <span class="kt">T</span><span class="o">)</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>  
    <span class="k">new</span> <span class="nc">MyClass</span><span class="o">[</span><span class="kt">Int</span><span class="o">](</span><span class="mi">1</span><span class="o">)</span>  
    <span class="k">new</span> <span class="nc">MyClass</span><span class="o">(</span><span class="mi">1</span><span class="o">)</span>   <span class="c1">// the type is being inferred, i.e. determined based on the value arguments  </span>
</pre></div>

<p>It is possible to restrict the type being used, e.g.</p>

<div class="highlight highlight-scala"><pre>    <span class="k">def</span> <span class="n">myFct</span><span class="o">[</span><span class="kt">T</span> <span class="k">&lt;:</span> <span class="kt">TopLevel</span><span class="o">](</span><span class="n">arg</span><span class="k">:</span> <span class="kt">T</span><span class="o">)</span><span class="k">:</span> <span class="kt">T</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// T must derive from TopLevel or be TopLevel</span>
    <span class="k">def</span> <span class="n">myFct</span><span class="o">[</span><span class="kt">T</span> <span class="k">&gt;:</span> <span class="kt">Level1</span><span class="o">](</span><span class="n">arg</span><span class="k">:</span> <span class="kt">T</span><span class="o">)</span><span class="k">:</span> <span class="kt">T</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>   <span class="c1">// T must be a supertype of Level1</span>
    <span class="k">def</span> <span class="n">myFct</span><span class="o">[</span><span class="kt">T</span> <span class="k">&gt;:</span> <span class="kt">Level1</span> <span class="k">&lt;:</span> <span class="kt">Top</span> <span class="kt">Level</span><span class="o">](</span><span class="n">arg</span><span class="k">:</span> <span class="kt">T</span><span class="o">)</span><span class="k">:</span> <span class="kt">T</span> <span class="o">=</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span>
</pre></div>

<h2>
<a name="user-content-variance" class="anchor" href="#variance" aria-hidden="true"><span class="octicon octicon-link"></span></a>Variance</h2>

<p>Given <code>A &lt;: B</code></p>

<p>If <code>C[A] &lt;: C[B]</code>, <code>C</code> is covariant</p>

<p>If <code>C[A] &gt;: C[B]</code>, <code>C</code> is contravariant</p>

<p>Otherwise C is nonvariant</p>

<div class="highlight highlight-scala"><pre>    <span class="k">class</span> <span class="nc">C</span><span class="o">[</span><span class="kt">+A</span><span class="o">]</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// C is covariant</span>
    <span class="k">class</span> <span class="nc">C</span><span class="o">[</span><span class="kt">-A</span><span class="o">]</span> <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// C is contravariant</span>
    <span class="k">class</span> <span class="nc">C</span><span class="o">[</span><span class="kt">A</span><span class="o">]</span>  <span class="o">{</span> <span class="o">...</span> <span class="o">}</span> <span class="c1">// C is nonvariant</span>
</pre></div>

<p>For a function, if <code>A2 &lt;: A1</code> and <code>B1 &lt;: B2</code>, then <code>A1 =&gt; B1 &lt;: A2 =&gt; B2</code>.</p>

<p>Functions must be contravariant in their argument types and covariant in their result types, e.g.</p>

<div class="highlight highlight-scala"><pre>    <span class="k">trait</span> <span class="nc">Function1</span><span class="o">[</span><span class="kt">-T</span>, <span class="kt">+U</span><span class="o">]</span> <span class="o">{</span>
      <span class="k">def</span> <span class="n">apply</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">T</span><span class="o">)</span><span class="k">:</span> <span class="kt">U</span>
    <span class="o">}</span> <span class="c1">// Variance check is OK because T is contravariant and U is covariant</span>

    <span class="k">class</span> <span class="nc">Array</span><span class="o">[</span><span class="kt">+T</span><span class="o">]</span> <span class="o">{</span>
      <span class="k">def</span> <span class="n">update</span><span class="o">(</span><span class="n">x</span><span class="k">:</span> <span class="kt">T</span><span class="o">)</span>
    <span class="o">}</span> <span class="c1">// variance checks fails</span>
</pre></div>

<p>Find out more about variance in
<a href="https://class.coursera.org/progfun-2012-001/lecture/81">lecture 4.4</a>
and <a href="https://class.coursera.org/progfun-2012-001/lecture/83">lecture 4.5</a></p>

<h2>
<a name="user-content-pattern-matching" class="anchor" href="#pattern-matching" aria-hidden="true"><span class="octicon octicon-link"></span></a>Pattern Matching</h2>

<p>Pattern matching is used for decomposing data structures:</p>

<div class="highlight highlight-scala"><pre>    <span class="n">unknownObject</span> <span class="k">match</span> <span class="o">{</span>
      <span class="k">case</span> <span class="nc">MyClass</span><span class="o">(</span><span class="n">n</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="o">...</span>
      <span class="k">case</span> <span class="nc">MyClass2</span><span class="o">(</span><span class="n">a</span><span class="o">,</span> <span class="n">b</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="o">...</span>
    <span class="o">}</span>
</pre></div>

<p>Here are a few example patterns</p>

<div class="highlight highlight-scala"><pre>    <span class="o">(</span><span class="n">someList</span><span class="k">:</span> <span class="kt">List</span><span class="o">[</span><span class="kt">T</span><span class="o">])</span> <span class="k">match</span> <span class="o">{</span>
      <span class="k">case</span> <span class="nc">Nil</span> <span class="k">=&gt;</span> <span class="o">...</span>          <span class="c1">// empty list</span>
      <span class="k">case</span> <span class="n">x</span> <span class="o">::</span> <span class="nc">Nil</span> <span class="k">=&gt;</span> <span class="o">...</span>     <span class="c1">// list with only one element</span>
      <span class="k">case</span> <span class="nc">List</span><span class="o">(</span><span class="n">x</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="o">...</span>      <span class="c1">// same as above</span>
      <span class="k">case</span> <span class="n">x</span> <span class="o">::</span> <span class="n">xs</span> <span class="k">=&gt;</span> <span class="o">...</span>      <span class="c1">// a list with at least one element. x is bound to the head,</span>
                               <span class="c1">// xs to the tail. xs could be Nil or some other list.</span>
      <span class="k">case</span> <span class="mi">1</span> <span class="o">::</span> <span class="mi">2</span> <span class="o">::</span> <span class="n">cs</span> <span class="k">=&gt;</span> <span class="o">...</span> <span class="c1">// lists that starts with 1 and then 2</span>
      <span class="k">case</span> <span class="o">(</span><span class="n">x</span><span class="o">,</span> <span class="n">y</span><span class="o">)</span> <span class="o">::</span> <span class="n">ps</span> <span class="k">=&gt;</span> <span class="o">...</span> <span class="c1">// a list where the head element is a pair</span>
      <span class="k">case</span> <span class="k">_</span> <span class="k">=&gt;</span> <span class="o">...</span>            <span class="c1">// default case if none of the above matches</span>
    <span class="o">}</span>
</pre></div>

<p>The last example shows that every pattern consists of sub-patterns: it
only matches lists with at least one element, where that element is a
pair. <code>x</code> and <code>y</code> are again patterns that could match only specific
types.</p>

<h3>
<a name="user-content-options" class="anchor" href="#options" aria-hidden="true"><span class="octicon octicon-link"></span></a>Options</h3>

<p>Pattern matching can also be used for <code>Option</code> values. Some
functions (like <code>Map.get</code>) return a value of type <code>Option[T]</code> which
is either a value of type <code>Some[T]</code> or the value <code>None</code>:</p>

<div class="highlight highlight-scala"><pre>    <span class="k">val</span> <span class="n">myMap</span> <span class="k">=</span> <span class="nc">Map</span><span class="o">(</span><span class="s">"a"</span> <span class="o">-&gt;</span> <span class="mi">42</span><span class="o">,</span> <span class="s">"b"</span> <span class="o">-&gt;</span> <span class="mi">43</span><span class="o">)</span>
    <span class="k">def</span> <span class="n">getMapValue</span><span class="o">(</span><span class="n">s</span><span class="k">:</span> <span class="kt">String</span><span class="o">)</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=</span> <span class="o">{</span>
      <span class="n">myMap</span> <span class="n">get</span> <span class="n">s</span> <span class="k">match</span> <span class="o">{</span>
        <span class="k">case</span> <span class="nc">Some</span><span class="o">(</span><span class="n">nb</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="s">"Value found: "</span> <span class="o">+</span> <span class="n">nb</span>
        <span class="k">case</span> <span class="nc">None</span> <span class="k">=&gt;</span> <span class="s">"No value found"</span>
      <span class="o">}</span>
    <span class="o">}</span>
    <span class="n">getMapValue</span><span class="o">(</span><span class="s">"a"</span><span class="o">)</span>  <span class="c1">// "Value found: 42"</span>
    <span class="n">getMapValue</span><span class="o">(</span><span class="s">"c"</span><span class="o">)</span>  <span class="c1">// "No value found"</span>
</pre></div>

<p>Most of the times when you write a pattern match on an option value,
the same expression can be written more concisely using combinator
methods of the <code>Option</code> class. For example, the function <code>getMapValue</code>
can be written as follows: </p>

<div class="highlight highlight-scala"><pre>    <span class="k">def</span> <span class="n">getMapValue</span><span class="o">(</span><span class="n">s</span><span class="k">:</span> <span class="kt">String</span><span class="o">)</span><span class="k">:</span> <span class="kt">String</span> <span class="o">=</span>
      <span class="n">myMap</span><span class="o">.</span><span class="n">get</span><span class="o">(</span><span class="n">s</span><span class="o">).</span><span class="n">map</span><span class="o">(</span><span class="s">"Value found: "</span> <span class="o">+</span> <span class="k">_</span><span class="o">).</span><span class="n">getOrElse</span><span class="o">(</span><span class="s">"No value found"</span><span class="o">)</span>
</pre></div>

<h3>
<a name="user-content-pattern-matching-in-anonymous-functions" class="anchor" href="#pattern-matching-in-anonymous-functions" aria-hidden="true"><span class="octicon octicon-link"></span></a>Pattern Matching in Anonymous Functions</h3>

<p>Pattern matches are also used quite often in anonymous functions:</p>

<div class="highlight highlight-scala"><pre>    <span class="k">val</span> <span class="n">pairs</span><span class="k">:</span> <span class="kt">List</span><span class="o">[(</span><span class="kt">Char</span>, <span class="kt">Int</span><span class="o">)]</span> <span class="k">=</span> <span class="o">(</span><span class="-Symbol">'a</span><span class="err">'</span><span class="o">,</span> <span class="mi">2</span><span class="o">)</span> <span class="o">::</span> <span class="o">(</span><span class="-Symbol">'b</span><span class="err">'</span><span class="o">,</span> <span class="mi">3</span><span class="o">)</span> <span class="o">::</span> <span class="nc">Nil</span>
    <span class="k">val</span> <span class="n">chars</span><span class="k">:</span> <span class="kt">List</span><span class="o">[</span><span class="kt">Char</span><span class="o">]</span> <span class="k">=</span> <span class="n">pairs</span><span class="o">.</span><span class="n">map</span><span class="o">(</span><span class="n">p</span> <span class="k">=&gt;</span> <span class="n">p</span> <span class="k">match</span> <span class="o">{</span>
      <span class="k">case</span> <span class="o">(</span><span class="n">ch</span><span class="o">,</span> <span class="n">num</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="n">ch</span>
    <span class="o">})</span>
</pre></div>

<p>Instead of <code>p =&gt; p match { case ... }</code>, you can simply write <code>{case ...}</code>, so the above example becomes more concise:</p>

<div class="highlight highlight-scala"><pre>    <span class="k">val</span> <span class="n">chars</span><span class="k">:</span> <span class="kt">List</span><span class="o">[</span><span class="kt">Char</span><span class="o">]</span> <span class="k">=</span> <span class="n">pairs</span> <span class="n">map</span> <span class="o">{</span>
      <span class="k">case</span> <span class="o">(</span><span class="n">ch</span><span class="o">,</span> <span class="n">num</span><span class="o">)</span> <span class="k">=&gt;</span> <span class="n">ch</span>
    <span class="o">}</span>
</pre></div>

<h2>
<a name="user-content-collections" class="anchor" href="#collections" aria-hidden="true"><span class="octicon octicon-link"></span></a>Collections</h2>

<p>Scala defines several collection classes:</p>

<h3>
<a name="user-content-base-classes" class="anchor" href="#base-classes" aria-hidden="true"><span class="octicon octicon-link"></span></a>Base Classes</h3>

<ul class="task-list">
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.Iterable"><code>Iterable</code></a> (collections you can iterate on)</li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.Seq"><code>Seq</code></a> (ordered sequences)</li>
<li><a href="http://www.scala-lang.org/api/current/index.html#scala.collection.Set"><code>Set</code></a></li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.Map"><code>Map</code></a> (lookup data structure)</li>
</ul><h3>
<a name="user-content-immutable-collections" class="anchor" href="#immutable-collections" aria-hidden="true"><span class="octicon octicon-link"></span></a>Immutable Collections</h3>

<ul class="task-list">
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.List"><code>List</code></a> (linked list, provides fast sequential access)</li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Stream"><code>Stream</code></a> (same as List, except that the tail is evaluated only on demand)</li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Vector"><code>Vector</code></a> (array-like type, implemented as tree of blocks, provides fast random access)</li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Range"><code>Range</code></a> (ordered sequence of integers with equal spacing)</li>
<li>
<a href="http://docs.oracle.com/javase/1.5.0/docs/api/java/lang/String.html"><code>String</code></a> (Java type, implicitly converted to a character sequence, so you can treat every string like a <code>Seq[Char]</code>)</li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Map"><code>Map</code></a> (collection that maps keys to values)</li>
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.collection.immutable.Set"><code>Set</code></a> (collection without duplicate elements)</li>
</ul><h3>
<a name="user-content-mutable-collections" class="anchor" href="#mutable-collections" aria-hidden="true"><span class="octicon octicon-link"></span></a>Mutable Collections</h3>

<ul class="task-list">
<li>
<a href="http://www.scala-lang.org/api/current/index.html#scala.Array"><code>Array</code></a> (Scala arrays are native JVM arrays at runtime, therefore they are very performant)</li>
<li>Scala also has mutable maps and sets; these should only be used if there are performance issues with immutable types</li>
</ul><h3>
<a name="user-content-examples" class="anchor" href="#examples" aria-hidden="true"><span class="octicon octicon-link"></span></a>Examples</h3>

<div class="highlight highlight-scala"><pre>    <span class="k">val</span> <span class="n">fruitList</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(</span><span class="s">"apples"</span><span class="o">,</span> <span class="s">"oranges"</span><span class="o">,</span> <span class="s">"pears"</span><span class="o">)</span>
    <span class="c1">// Alternative syntax for lists</span>
    <span class="k">val</span> <span class="n">fruit</span> <span class="k">=</span> <span class="s">"apples"</span> <span class="o">::</span> <span class="o">(</span><span class="s">"oranges"</span> <span class="o">::</span> <span class="o">(</span><span class="s">"pears"</span> <span class="o">::</span> <span class="nc">Nil</span><span class="o">))</span> <span class="c1">// parens optional, :: is right-associative</span>
    <span class="n">fruit</span><span class="o">.</span><span class="n">head</span>   <span class="c1">// "apples"</span>
    <span class="n">fruit</span><span class="o">.</span><span class="n">tail</span>   <span class="c1">// List("oranges", "pears")</span>
    <span class="k">val</span> <span class="n">empty</span> <span class="k">=</span> <span class="nc">List</span><span class="o">()</span>
    <span class="k">val</span> <span class="n">empty</span> <span class="k">=</span> <span class="nc">Nil</span>

    <span class="k">val</span> <span class="n">nums</span> <span class="k">=</span> <span class="nc">Vector</span><span class="o">(</span><span class="s">"louis"</span><span class="o">,</span> <span class="s">"frank"</span><span class="o">,</span> <span class="s">"hiromi"</span><span class="o">)</span>
    <span class="n">nums</span><span class="o">(</span><span class="mi">1</span><span class="o">)</span>                     <span class="c1">// element at index 1, returns "frank", complexity O(log(n))</span>
    <span class="n">nums</span><span class="o">.</span><span class="n">updated</span><span class="o">(</span><span class="mi">2</span><span class="o">,</span> <span class="s">"helena"</span><span class="o">)</span>   <span class="c1">// new vector with a different string at index 2, complexity O(log(n))</span>

    <span class="k">val</span> <span class="n">fruitSet</span> <span class="k">=</span> <span class="nc">Set</span><span class="o">(</span><span class="s">"apple"</span><span class="o">,</span> <span class="s">"banana"</span><span class="o">,</span> <span class="s">"pear"</span><span class="o">,</span> <span class="s">"banana"</span><span class="o">)</span>
    <span class="n">fruitSet</span><span class="o">.</span><span class="n">size</span>    <span class="c1">// returns 3: there are no duplicates, only one banana</span>

    <span class="k">val</span> <span class="n">r</span><span class="k">:</span> <span class="kt">Range</span> <span class="o">=</span> <span class="mi">1</span> <span class="n">until</span> <span class="mi">5</span> <span class="c1">// 1, 2, 3, 4</span>
    <span class="k">val</span> <span class="n">s</span><span class="k">:</span> <span class="kt">Range</span> <span class="o">=</span> <span class="mi">1</span> <span class="n">to</span> <span class="mi">5</span>    <span class="c1">// 1, 2, 3, 4, 5</span>
    <span class="mi">1</span> <span class="n">to</span> <span class="mi">10</span> <span class="n">by</span> <span class="mi">3</span>  <span class="c1">// 1, 4, 7, 10</span>
    <span class="mi">6</span> <span class="n">to</span> <span class="mi">1</span> <span class="n">by</span> <span class="o">-</span><span class="mi">2</span>  <span class="c1">// 6, 4, 2</span>

    <span class="k">val</span> <span class="n">s</span> <span class="k">=</span> <span class="o">(</span><span class="mi">1</span> <span class="n">to</span> <span class="mi">6</span><span class="o">).</span><span class="n">toSet</span>
    <span class="n">s</span> <span class="n">map</span> <span class="o">(</span><span class="k">_</span> <span class="o">+</span> <span class="mi">2</span><span class="o">)</span> <span class="c1">// adds 2 to each element of the set</span>

    <span class="k">val</span> <span class="n">s</span> <span class="k">=</span> <span class="s">"Hello World"</span>
    <span class="n">s</span> <span class="n">filter</span> <span class="o">(</span><span class="n">c</span> <span class="k">=&gt;</span> <span class="n">c</span><span class="o">.</span><span class="n">isUpper</span><span class="o">)</span> <span class="c1">// returns "HW"; strings can be treated as Seq[Char]</span>

    <span class="c1">// Operations on sequences</span>
    <span class="k">val</span> <span class="n">xs</span> <span class="k">=</span> <span class="nc">List</span><span class="o">(...)</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">length</span>   <span class="c1">// number of elements, complexity O(n)</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">last</span>     <span class="c1">// last element (exception if xs is empty), complexity O(n)</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">init</span>     <span class="c1">// all elements of xs but the last (exception if xs is empty), complexity O(n)</span>
    <span class="n">xs</span> <span class="n">take</span> <span class="n">n</span>   <span class="c1">// first n elements of xs</span>
    <span class="n">xs</span> <span class="n">drop</span> <span class="n">n</span>   <span class="c1">// the rest of the collection after taking n elements</span>
    <span class="n">xs</span><span class="o">(</span><span class="n">n</span><span class="o">)</span>       <span class="c1">// the nth element of xs, complexity O(n)</span>
    <span class="n">xs</span> <span class="o">++</span> <span class="n">ys</span>    <span class="c1">// concatenation, complexity O(n)</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">reverse</span>  <span class="c1">// reverse the order, complexity O(n)</span>
    <span class="n">xs</span> <span class="n">updated</span><span class="o">(</span><span class="n">n</span><span class="o">,</span> <span class="n">x</span><span class="o">)</span>  <span class="c1">// same list than xs, except at index n where it contains x, complexity O(n)</span>
    <span class="n">xs</span> <span class="n">indexOf</span> <span class="n">x</span>      <span class="c1">// the index of the first element equal to x (-1 otherwise)</span>
    <span class="n">xs</span> <span class="n">contains</span> <span class="n">x</span>     <span class="c1">// same as xs indexOf x &gt;= 0</span>
    <span class="n">xs</span> <span class="n">filter</span> <span class="n">p</span>       <span class="c1">// returns a list of the elements that satisfy the predicate p</span>
    <span class="n">xs</span> <span class="n">filterNot</span> <span class="n">p</span>    <span class="c1">// filter with negated p </span>
    <span class="n">xs</span> <span class="n">partition</span> <span class="n">p</span>    <span class="c1">// same as (xs filter p, xs filterNot p)</span>
    <span class="n">xs</span> <span class="n">takeWhile</span> <span class="n">p</span>    <span class="c1">// the longest prefix consisting of elements that satisfy p</span>
    <span class="n">xs</span> <span class="n">dropWhile</span> <span class="n">p</span>    <span class="c1">// the remainder of the list after any leading element satisfying p have been removed</span>
    <span class="n">xs</span> <span class="n">span</span> <span class="n">p</span>         <span class="c1">// same as (xs takeWhile p, xs dropWhile p)</span>

    <span class="nc">List</span><span class="o">(</span><span class="n">x1</span><span class="o">,</span> <span class="o">...,</span> <span class="n">xn</span><span class="o">)</span> <span class="n">reduceLeft</span> <span class="n">op</span>    <span class="c1">// (...(x1 op x2) op x3) op ...) op xn</span>
    <span class="nc">List</span><span class="o">(</span><span class="n">x1</span><span class="o">,</span> <span class="o">...,</span> <span class="n">xn</span><span class="o">).</span><span class="n">foldLeft</span><span class="o">(</span><span class="n">z</span><span class="o">)(</span><span class="n">op</span><span class="o">)</span>  <span class="c1">// (...( z op x1) op x2) op ...) op xn</span>
    <span class="nc">List</span><span class="o">(</span><span class="n">x1</span><span class="o">,</span> <span class="o">...,</span> <span class="n">xn</span><span class="o">)</span> <span class="n">reduceRight</span> <span class="n">op</span>   <span class="c1">// x1 op (... (x{n-1} op xn) ...)</span>
    <span class="nc">List</span><span class="o">(</span><span class="n">x1</span><span class="o">,</span> <span class="o">...,</span> <span class="n">xn</span><span class="o">).</span><span class="n">foldRight</span><span class="o">(</span><span class="n">z</span><span class="o">)(</span><span class="n">op</span><span class="o">)</span> <span class="c1">// x1 op (... (    xn op  z) ...)</span>

    <span class="n">xs</span> <span class="n">exists</span> <span class="n">p</span>    <span class="c1">// true if there is at least one element for which predicate p is true</span>
    <span class="n">xs</span> <span class="n">forall</span> <span class="n">p</span>    <span class="c1">// true if p(x) is true for all elements</span>
    <span class="n">xs</span> <span class="n">zip</span> <span class="n">ys</span>      <span class="c1">// returns a list of pairs which groups elements with same index together</span>
    <span class="n">xs</span> <span class="n">unzip</span>       <span class="c1">// opposite of zip: returns a pair of two lists</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">flatMap</span> <span class="n">f</span>   <span class="c1">// applies the function to all elements and concatenates the result</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">sum</span>         <span class="c1">// sum of elements of the numeric collection</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">product</span>     <span class="c1">// product of elements of the numeric collection</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">max</span>         <span class="c1">// maximum of collection</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">min</span>         <span class="c1">// minimum of collection</span>
    <span class="n">xs</span><span class="o">.</span><span class="n">flatten</span>     <span class="c1">// flattens a collection of collection into a single-level collection</span>
    <span class="n">xs</span> <span class="n">groupBy</span> <span class="n">f</span>   <span class="c1">// returns a map which points to a list of elements</span>
    <span class="n">xs</span> <span class="n">distinct</span>    <span class="c1">// sequence of distinct entries (removes duplicates)</span>

    <span class="n">x</span> <span class="o">+:</span> <span class="n">xs</span>  <span class="c1">// creates a new collection with leading element x</span>
    <span class="n">xs</span> <span class="o">:+</span> <span class="n">x</span>  <span class="c1">// creates a new collection with trailing element x</span>

    <span class="c1">// Operations on maps</span>
    <span class="k">val</span> <span class="n">myMap</span> <span class="k">=</span> <span class="nc">Map</span><span class="o">(</span><span class="s">"I"</span> <span class="o">-&gt;</span> <span class="mi">1</span><span class="o">,</span> <span class="s">"V"</span> <span class="o">-&gt;</span> <span class="mi">5</span><span class="o">,</span> <span class="s">"X"</span> <span class="o">-&gt;</span> <span class="mi">10</span><span class="o">)</span>  <span class="c1">// create a map</span>
    <span class="n">myMap</span><span class="o">(</span><span class="s">"I"</span><span class="o">)</span>      <span class="c1">// =&gt; 1  </span>
    <span class="n">myMap</span><span class="o">(</span><span class="s">"A"</span><span class="o">)</span>      <span class="c1">// =&gt; java.util.NoSuchElementException  </span>
    <span class="n">myMap</span> <span class="n">get</span> <span class="s">"A"</span>   <span class="c1">// =&gt; None </span>
    <span class="n">myMap</span> <span class="n">get</span> <span class="s">"I"</span>   <span class="c1">// =&gt; Some(1)</span>
    <span class="n">myMap</span><span class="o">.</span><span class="n">updated</span><span class="o">(</span><span class="s">"V"</span><span class="o">,</span> <span class="mi">15</span><span class="o">)</span>  <span class="c1">// returns a new map where "V" maps to 15 (entry is updated)</span>
                            <span class="c1">// if the key ("V" here) does not exist, a new entry is added</span>

    <span class="c1">// Operations on Streams</span>
    <span class="k">val</span> <span class="n">xs</span> <span class="k">=</span> <span class="nc">Stream</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="mi">2</span><span class="o">,</span> <span class="mi">3</span><span class="o">)</span>
    <span class="k">val</span> <span class="n">xs</span> <span class="k">=</span> <span class="nc">Stream</span><span class="o">.</span><span class="n">cons</span><span class="o">(</span><span class="mi">1</span><span class="o">,</span> <span class="nc">Stream</span><span class="o">.</span><span class="n">cons</span><span class="o">(</span><span class="mi">2</span><span class="o">,</span> <span class="nc">Stream</span><span class="o">.</span><span class="n">cons</span><span class="o">(</span><span class="mi">3</span><span class="o">,</span> <span class="nc">Stream</span><span class="o">.</span><span class="n">empty</span><span class="o">)))</span> <span class="c1">// same as above</span>
    <span class="o">(</span><span class="mi">1</span> <span class="n">to</span> <span class="mi">1000</span><span class="o">).</span><span class="n">toStream</span> <span class="c1">// =&gt; Stream(1, ?)</span>
    <span class="n">x</span> <span class="o">#::</span> <span class="n">xs</span> <span class="c1">// Same as Stream.cons(x, xs)</span>
             <span class="c1">// In the Stream's cons operator, the second parameter (the tail)</span>
             <span class="c1">// is defined as a "call by name" parameter.</span>
             <span class="c1">// Note that x::xs always produces a List</span>
</pre></div>

<h2>
<a name="user-content-pairs-similar-for-larger-tuples" class="anchor" href="#pairs-similar-for-larger-tuples" aria-hidden="true"><span class="octicon octicon-link"></span></a>Pairs (similar for larger Tuples)</h2>

<div class="highlight highlight-scala"><pre>    <span class="k">val</span> <span class="n">pair</span> <span class="k">=</span> <span class="o">(</span><span class="s">"answer"</span><span class="o">,</span> <span class="mi">42</span><span class="o">)</span>   <span class="c1">// type: (String, Int)</span>
    <span class="k">val</span> <span class="o">(</span><span class="n">label</span><span class="o">,</span> <span class="n">value</span><span class="o">)</span> <span class="k">=</span> <span class="n">pair</span>   <span class="c1">// label = "answer", value = 42  </span>
    <span class="n">pair</span><span class="o">.</span><span class="n">_1</span> <span class="c1">// "answer"  </span>
    <span class="n">pair</span><span class="o">.</span><span class="n">_2</span> <span class="c1">// 42  </span>
</pre></div>

<h2>
<a name="user-content-ordering" class="anchor" href="#ordering" aria-hidden="true"><span class="octicon octicon-link"></span></a>Ordering</h2>

<p>There is already a class in the standard library that represents orderings: <code>scala.math.Ordering[T]</code> which contains
comparison functions such as <code>lt()</code> and <code>gt()</code> for standard types. Types with a single natural ordering should inherit from 
the trait <code>scala.math.Ordered[T]</code>.</p>

<div class="highlight highlight-scala"><pre>    <span class="k">import</span> <span class="nn">math.Ordering</span>  

    <span class="k">def</span> <span class="n">msort</span><span class="o">[</span><span class="kt">T</span><span class="o">](</span><span class="n">xs</span><span class="k">:</span> <span class="kt">List</span><span class="o">[</span><span class="kt">T</span><span class="o">])(</span><span class="k">implicit</span> <span class="n">ord</span><span class="k">:</span> <span class="kt">Ordering</span><span class="o">)</span> <span class="k">=</span> <span class="o">{</span> <span class="o">...}</span>  
    <span class="n">msort</span><span class="o">(</span><span class="n">fruits</span><span class="o">)(</span><span class="nc">Ordering</span><span class="o">.</span><span class="nc">String</span><span class="o">)</span>  
    <span class="n">msort</span><span class="o">(</span><span class="n">fruits</span><span class="o">)</span>   <span class="c1">// the compiler figures out the right ordering  </span>
</pre></div>

<h2>
<a name="user-content-for-comprehensions" class="anchor" href="#for-comprehensions" aria-hidden="true"><span class="octicon octicon-link"></span></a>For-Comprehensions</h2>

<p>A for-comprehension is syntactic sugar for <code>map</code>, <code>flatMap</code> and <code>filter</code> operations on collections.</p>

<p>The general form is <code>for (s) yield e</code></p>

<ul class="task-list">
<li>
<code>s</code> is a sequence of generators and filters</li>
<li>
<code>p &lt;- e</code> is a generator</li>
<li>
<code>if f</code> is a filter</li>
<li>If there are several generators (equivalent of a nested loop), the last generator varies faster than the first</li>
<li>You can use <code>{ s }</code> instead of <code>( s )</code> if you want to use multiple lines without requiring semicolons</li>
<li>
<code>e</code> is an element of the resulting collection</li>
</ul><h3>
<a name="user-content-example-1" class="anchor" href="#example-1" aria-hidden="true"><span class="octicon octicon-link"></span></a>Example 1</h3>

<div class="highlight highlight-scala"><pre>    <span class="c1">// list all combinations of numbers x and y where x is drawn from</span>
    <span class="c1">// 1 to M and y is drawn from 1 to N</span>
    <span class="k">for</span> <span class="o">(</span><span class="n">x</span> <span class="k">&lt;-</span> <span class="mi">1</span> <span class="n">to</span> <span class="n">M</span><span class="o">;</span> <span class="n">y</span> <span class="k">&lt;-</span> <span class="mi">1</span> <span class="n">to</span> <span class="n">N</span><span class="o">)</span>
      <span class="k">yield</span> <span class="o">(</span><span class="n">x</span><span class="o">,</span><span class="n">y</span><span class="o">)</span>
</pre></div>

<p>is equivalent to</p>

<div class="highlight highlight-scala"><pre>    <span class="o">(</span><span class="mi">1</span> <span class="n">to</span> <span class="n">M</span><span class="o">)</span> <span class="n">flatMap</span> <span class="o">(</span><span class="n">x</span> <span class="k">=&gt;</span> <span class="o">(</span><span class="mi">1</span> <span class="n">to</span> <span class="n">N</span><span class="o">)</span> <span class="n">map</span> <span class="o">(</span><span class="n">y</span> <span class="k">=&gt;</span> <span class="o">(</span><span class="n">x</span><span class="o">,</span> <span class="n">y</span><span class="o">)))</span>
</pre></div>

<h3>
<a name="user-content-translation-rules" class="anchor" href="#translation-rules" aria-hidden="true"><span class="octicon octicon-link"></span></a>Translation Rules</h3>

<p>A for-expression looks like a traditional for loop but works differently internally</p>

<p><code>for (x &lt;- e1) yield e2</code> is translated to <code>e1.map(x =&gt; e2)</code></p>

<p><code>for (x &lt;- e1 if f) yield e2</code> is translated to <code>for (x &lt;- e1.filter(x =&gt; f)) yield e2</code></p>

<p><code>for (x &lt;- e1; y &lt;- e2) yield e3</code> is translated to <code>e1.flatMap(x =&gt; for (y &lt;- e2) yield e3)</code></p>

<p>This means you can use a for-comprehension for your own type, as long
as you define <code>map</code>, <code>flatMap</code> and <code>filter</code>.</p>

<p>For more, see <a href="https://class.coursera.org/progfun-2012-001/lecture/111">lecture 6.5</a>.</p>

<h3>
<a name="user-content-example-2" class="anchor" href="#example-2" aria-hidden="true"><span class="octicon octicon-link"></span></a>Example 2</h3>

<div class="highlight highlight-scala"><pre>    <span class="k">for</span> <span class="o">{</span>  
      <span class="n">i</span> <span class="k">&lt;-</span> <span class="mi">1</span> <span class="n">until</span> <span class="n">n</span>  
      <span class="n">j</span> <span class="k">&lt;-</span> <span class="mi">1</span> <span class="n">until</span> <span class="n">i</span>  
      <span class="k">if</span> <span class="n">isPrime</span><span class="o">(</span><span class="n">i</span> <span class="o">+</span> <span class="n">j</span><span class="o">)</span>  
    <span class="o">}</span> <span class="k">yield</span> <span class="o">(</span><span class="n">i</span><span class="o">,</span> <span class="n">j</span><span class="o">)</span>  
</pre></div>

<p>is equivalent to</p>

<div class="highlight highlight-scala"><pre>    <span class="k">for</span> <span class="o">(</span><span class="n">i</span> <span class="k">&lt;-</span> <span class="mi">1</span> <span class="n">until</span> <span class="n">n</span><span class="o">;</span> <span class="n">j</span> <span class="k">&lt;-</span> <span class="mi">1</span> <span class="n">until</span> <span class="n">i</span> <span class="k">if</span> <span class="n">isPrime</span><span class="o">(</span><span class="n">i</span> <span class="o">+</span> <span class="n">j</span><span class="o">))</span>
        <span class="k">yield</span> <span class="o">(</span><span class="n">i</span><span class="o">,</span> <span class="n">j</span><span class="o">)</span>  
</pre></div>

<p>is equivalent to</p>

<div class="highlight highlight-scala"><pre>    <span class="o">(</span><span class="mi">1</span> <span class="n">until</span> <span class="n">n</span><span class="o">).</span><span class="n">flatMap</span><span class="o">(</span><span class="n">i</span> <span class="k">=&gt;</span> <span class="o">(</span><span class="mi">1</span> <span class="n">until</span> <span class="n">i</span><span class="o">).</span><span class="n">filter</span><span class="o">(</span><span class="n">j</span> <span class="k">=&gt;</span> <span class="n">isPrime</span><span class="o">(</span><span class="n">i</span> <span class="o">+</span> <span class="n">j</span><span class="o">)).</span><span class="n">map</span><span class="o">(</span><span class="n">j</span> <span class="k">=&gt;</span> <span class="o">(</span><span class="n">i</span><span class="o">,</span> <span class="n">j</span><span class="o">)))</span>
</pre></div></article>
  </div>

  </div>
</div>

<a href="#jump-to-line" rel="facebox[.linejump]" data-hotkey="l" style="display:none">Jump to Line</a>
<div id="jump-to-line" style="display:none">
  <form accept-charset="UTF-8" class="js-jump-to-line-form">
    <input class="linejump-input js-jump-to-line-field" type="text" placeholder="Jump to line&hellip;" autofocus>
    <button type="submit" class="button">Go</button>
  </form>
</div>

        </div>

      </div><!-- /.repo-container -->
      <div class="modal-backdrop"></div>
    </div><!-- /.container -->
  </div><!-- /.site -->


    </div><!-- /.wrapper -->

      <div class="container">
  <div class="site-footer" role="contentinfo">
    <ul class="site-footer-links right">
      <li><a href="https://status.github.com/">Status</a></li>
      <li><a href="http://developer.github.com">API</a></li>
      <li><a href="http://training.github.com">Training</a></li>
      <li><a href="http://shop.github.com">Shop</a></li>
      <li><a href="/blog">Blog</a></li>
      <li><a href="/about">About</a></li>

    </ul>

    <a href="/" aria-label="Homepage">
      <span class="mega-octicon octicon-mark-github" title="GitHub"></span>
    </a>

    <ul class="site-footer-links">
      <li>&copy; 2014 <span title="0.03911s from github-fe125-cp1-prd.iad.github.net">GitHub</span>, Inc.</li>
        <li><a href="/site/terms">Terms</a></li>
        <li><a href="/site/privacy">Privacy</a></li>
        <li><a href="/security">Security</a></li>
        <li><a href="/contact">Contact</a></li>
    </ul>
  </div><!-- /.site-footer -->
</div><!-- /.container -->


    <div class="fullscreen-overlay js-fullscreen-overlay" id="fullscreen_overlay">
  <div class="fullscreen-container js-suggester-container">
    <div class="textarea-wrap">
      <textarea name="fullscreen-contents" id="fullscreen-contents" class="fullscreen-contents js-fullscreen-contents js-suggester-field" placeholder=""></textarea>
    </div>
  </div>
  <div class="fullscreen-sidebar">
    <a href="#" class="exit-fullscreen js-exit-fullscreen tooltipped tooltipped-w" aria-label="Exit Zen Mode">
      <span class="mega-octicon octicon-screen-normal"></span>
    </a>
    <a href="#" class="theme-switcher js-theme-switcher tooltipped tooltipped-w"
      aria-label="Switch themes">
      <span class="octicon octicon-color-mode"></span>
    </a>
  </div>
</div>



    <div id="ajax-error-message" class="flash flash-error">
      <span class="octicon octicon-alert"></span>
      <a href="#" class="octicon octicon-x flash-close js-ajax-error-dismiss" aria-label="Dismiss error"></a>
      Something went wrong with that request. Please try again.
    </div>


      <script crossorigin="anonymous" src="https://assets-cdn.github.com/assets/frameworks-ba50a1ca41995f0b006425c6db96c5669d18fd98.js" type="text/javascript"></script>
      <script async="async" crossorigin="anonymous" src="https://assets-cdn.github.com/assets/github-4b0cc50660dc36f688ff56b4766b8c8b5f7ac0ee.js" type="text/javascript"></script>
      
      
        <script async src="https://www.google-analytics.com/analytics.js"></script>
  </body>
</html>

